package strategy

import strategy.simuduck.behavior.fly.FlyRocketPowered
import strategy.simuduck.model.duck.Duck
import strategy.simuduck.model.duck.ModelDuck

fun main() {
    val model: Duck = ModelDuck()
    model.performFly()
    model.mySetFlyBehavior(FlyRocketPowered())
    model.performFly()
}