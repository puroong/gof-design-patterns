package iterator

import kotlin.collections.Iterator

class DinerMenu : Menu {
    companion object {
        val MAX_ITEMS: Int = 6
    }
    var numberOfItems: Int = 0
    lateinit var menuItems: Array<MenuItem?>

    init {
        menuItems = Array(MAX_ITEMS) { null }

        addItem("Vegetarian BLT",
        "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99)
        addItem("BLT",
        "Bacon with lettuce & tomato on whole wheat", false, 2.99)
        addItem("Soup of the day",
        "Soup of the day, with a side of potato salad", false, 3.29)
        addItem("Hotdog",
        "A hot dog, with saurkraut, relish, onions, topped with cheese",
        false, 3.05)
    }

    fun addItem(name: String, description: String, vegeterian: Boolean, price: Double) {
        val menuItem: MenuItem = MenuItem(name, description, vegeterian, price)
        if(numberOfItems >= MAX_ITEMS) {
            println("Can't add item to menu")
        } else {
            menuItems[numberOfItems] = menuItem
            numberOfItems += 1
        }
    }

    override fun createIterator(): Iterator<MenuItem?> {
        return menuItems.iterator()
    }
}