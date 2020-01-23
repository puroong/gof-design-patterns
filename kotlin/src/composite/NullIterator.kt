package composite

import java.lang.NullPointerException

class NullIterator : Iterator<MenuComponent> {
    override fun hasNext(): Boolean {
        return false
    }

    override fun next(): MenuComponent {
        throw NullPointerException()
    }
}