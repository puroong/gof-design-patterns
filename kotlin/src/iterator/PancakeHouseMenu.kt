package iterator

class PancakeHouseMenu : Menu {
    val menuItems: ArrayList<MenuItem> = ArrayList()

    init {
        addItem("K&B’s Pancake Breakfast",
        "Pancakes with scrambled eggs, and toast",
        true,
        2.99)
        addItem("Regular Pancake Breakfast",
        "Pancakes with fried eggs, sausage",
        false,
        2.99)
        addItem("Blueberry Pancakes",
        "Pancakes made with fresh blueberries",
        true,
        3.49)
        addItem("Waffles",
        "Waffles, with your choice of blueberries or strawberries",
        true,
        3.59)
    }

    fun addItem(name: String, description: String, vegeterian: Boolean, price: Double) {
        val menuItem: MenuItem = MenuItem(name, description, vegeterian, price)
        menuItems.add(menuItem)
    }

    override fun createIterator(): Iterator<MenuItem?> {
        return menuItems.iterator()
    }
}