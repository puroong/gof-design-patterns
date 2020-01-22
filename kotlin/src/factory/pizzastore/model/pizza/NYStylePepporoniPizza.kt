package factory.pizzastore.model.pizza

import factory.pizzastore.methodNabstract.PizzaIngredientFactory

class NYStylePepporoniPizza(val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override val name: String = "NYStylePepperoniPizza"

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.createClam()
        pepperoni = ingredientFactory.createPepperoni()
    }
}