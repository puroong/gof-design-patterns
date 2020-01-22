package strategy.simuduck.model.duck

import strategy.simuduck.behavior.fly.FlyBehavior
import strategy.simuduck.behavior.fly.FlyNoWay
import strategy.simuduck.behavior.quack.Quack
import strategy.simuduck.behavior.quack.QuackBehavior

class ModelDuck(override var flyBehavior: FlyBehavior, override var quackBehavior: QuackBehavior) : Duck() {
    constructor(): this(FlyNoWay(), Quack()) {}

    override fun display() {
        println("I'm a model duck")
    }

}