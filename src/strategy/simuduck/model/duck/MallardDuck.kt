package strategy.simuduck.model.duck

import strategy.simuduck.behavior.fly.FlyBehavior
import strategy.simuduck.behavior.fly.FlyWithWings
import strategy.simuduck.behavior.quack.Quack
import strategy.simuduck.behavior.quack.QuackBehavior

class MallardDuck(override var flyBehavior: FlyBehavior, override var quackBehavior: QuackBehavior) : Duck() {
    constructor() : this(FlyWithWings(), Quack()) {}

    override fun display() {
        println("I'm a real mallard duck")
    }
}