package iterator

class Waitress(val menus: ArrayList<Menu>) {
    fun printMenu() {
        val menuIterator: Iterator<Menu> = menus.iterator()
        while (menuIterator.hasNext()) {
            val menu: Menu = menuIterator.next()
            printMenu(menu.createIterator())
        }
    }

    fun printMenu(iterator: Iterator<MenuItem?>) {
        while (iterator.hasNext()) {
            val menuItem: MenuItem? = iterator.next() as? MenuItem
            println("${menuItem?.name}, ${menuItem?.price} -- ${menuItem?.description}")
        }
    }
}