package factory.pizzastore.model.pizza

import factory.pizzastore.methodNabstract.PizzaIngredientFactory

class VeggiePizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override val name: String = "VeggiePizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
        veggies = ingredientFactory.createVeggies()
    }
}