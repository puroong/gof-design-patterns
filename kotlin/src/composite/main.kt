package composite

fun main() {
    val pancakeHouseMenu: MenuComponent = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu: MenuComponent = Menu("DINER MENU", "Dinner")
    val dessertMenu: MenuComponent = Menu("DESSERT MENU", "Dessert of course!")

    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)

    dinerMenu.add(MenuItem(
        "Pasta",
        "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
        true,
        3.89
    ))
    dinerMenu.add(dessertMenu)

    dessertMenu.add(MenuItem(
        "Apple Pie",
        "Applie pie with a flakey crust, toopped with vanilla icecream",
        true,
        1.59
    ))

    val waitress: Waitress = Waitress(allMenus)

    waitress.printMenu()
}