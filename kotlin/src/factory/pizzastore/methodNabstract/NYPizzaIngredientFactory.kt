package factory.pizzastore.methodNabstract

import factory.pizzastore.model.cheese.Cheese
import factory.pizzastore.model.cheese.ReggianoCheese
import factory.pizzastore.model.clams.Clams
import factory.pizzastore.model.clams.FreshClams
import factory.pizzastore.model.dough.Dough
import factory.pizzastore.model.dough.ThinCrustDough
import factory.pizzastore.model.pepperoni.Pepperoni
import factory.pizzastore.model.pepperoni.SlicedPepperoni
import factory.pizzastore.model.sauce.MarinaraSauce
import factory.pizzastore.model.sauce.Sauce
import factory.pizzastore.model.veggie.*

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): List<Veggie> {
        val veggies = listOf(Garlic(), Onion(), Mushroom(), RedPepper())
        return veggies
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }

}