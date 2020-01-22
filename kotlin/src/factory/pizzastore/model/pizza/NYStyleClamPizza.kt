package factory.pizzastore.model.pizza

import factory.pizzastore.methodNabstract.PizzaIngredientFactory

class NYStyleClamPizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override val name: String = "NYStyleClamPizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
    }
}