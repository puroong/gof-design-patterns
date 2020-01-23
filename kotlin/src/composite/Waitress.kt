package composite

import java.lang.UnsupportedOperationException

class Waitress(val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }

    fun printVegeterianMenu() {
        val iterator: Iterator<MenuComponent?>? = allMenus.createIterator()
        println("\nVEGETERIAN MENU\n---")
        while(iterator?.hasNext() ?: false) {
            val menuComponent: MenuComponent = iterator?.next() as MenuComponent
            try {
                if(menuComponent.isVegeterian()) {
                    menuComponent.print()
                }
            } catch (e: UnsupportedOperationException) {}

        }
    }
}