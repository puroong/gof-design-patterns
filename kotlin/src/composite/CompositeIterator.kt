package composite

import java.lang.NullPointerException
import java.util.*

class CompositeIterator(iterator: Iterator<MenuComponent>) : Iterator<MenuComponent> {
    val stack: Stack<Iterator<MenuComponent>> = Stack()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        if(stack.empty()) return false
        else {
            val iterator: Iterator<MenuComponent> = stack.peek() as Iterator<MenuComponent>
            if(!iterator.hasNext()) {
                stack.pop()
                return hasNext()
            } else {
                return true
            }
        }
    }

    override fun next(): MenuComponent {
        if(hasNext()) {
            val iterator: Iterator<MenuComponent> = stack.peek() as Iterator<MenuComponent>
            val component: MenuComponent = iterator.next() as MenuComponent
            if (component is Menu) {
                stack.push(component.createIterator())
            }
            return component
        } else {
            throw NullPointerException()
        }
    }
}