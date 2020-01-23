package composite

import java.lang.UnsupportedOperationException

abstract class MenuComponent {
    open fun isVegeterian(): Boolean {
        throw UnsupportedOperationException()
    }

    open fun add(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun print() {
        throw UnsupportedOperationException()
    }

    open fun createIterator(): Iterator<MenuComponent>? {
        throw UnsupportedOperationException()
    }
}