package factory.pizzastore.model.pizza

import factory.pizzastore.methodNabstract.PizzaIngredientFactory

class NYStyleCheesePizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override val name: String = "NYStyleCheesePizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}