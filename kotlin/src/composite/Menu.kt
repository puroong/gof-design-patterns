package composite

class Menu(
    val name: String,
    val description: String
    ) : MenuComponent() {
    val menuComponent: ArrayList<MenuComponent> = ArrayList()
    var iterator: Iterator<MenuComponent>? = null

    override fun add(menuComponent: MenuComponent) {
        this.menuComponent.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        this.menuComponent.remove(menuComponent)
    }

    fun getChild(i: Int): MenuComponent {
        return menuComponent.get(i)
    }

    override fun print() {
        println("\n $name, $description\n==============")

        val iterator: Iterator<MenuComponent> = menuComponent.iterator()
        while (iterator.hasNext()) {
            val menuComponent: MenuComponent = iterator.next()
            menuComponent.print()
        }
    }

    override fun createIterator(): Iterator<MenuComponent>? {
        if(iterator == null) {
            iterator = CompositeIterator(menuComponent.iterator())
        }

        return iterator
    }
}