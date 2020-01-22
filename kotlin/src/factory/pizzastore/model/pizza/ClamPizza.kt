package factory.pizzastore.model.pizza

import factory.pizzastore.methodNabstract.PizzaIngredientFactory

class ClamPizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override val name: String = "ClamPizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
    }
}