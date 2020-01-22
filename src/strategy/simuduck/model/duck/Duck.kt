package strategy.simuduck.model.duck

import strategy.simuduck.behavior.fly.FlyBehavior
import strategy.simuduck.behavior.quack.QuackBehavior

abstract class Duck {
    protected abstract var flyBehavior: FlyBehavior
    protected abstract var quackBehavior: QuackBehavior

    fun mySetFlyBehavior(value: FlyBehavior) {
        flyBehavior = value
    }
    fun mySetQuackBehavior(value: QuackBehavior) {
        quackBehavior = value
    }

    fun performFly() {
        flyBehavior.fly()
    }
    fun performQuack() {
        quackBehavior.quack()
    }
    abstract fun display()
    fun swim() {
        println("All ducks float, even decoys!")
    }
}
