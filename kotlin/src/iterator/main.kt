package iterator

fun main() {
    val pancakeHouseMenu: PancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu: DinerMenu = DinerMenu()
    val cafeMenu: CafeMenu = CafeMenu()

    val waitress: Waitress = Waitress(arrayListOf(pancakeHouseMenu, dinerMenu, cafeMenu))

    waitress.printMenu()
}