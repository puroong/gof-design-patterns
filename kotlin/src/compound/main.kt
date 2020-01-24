package compound

import java.nio.channels.FileLock

fun simulate(duckFactory: AbstractDuckFactory) {
    val mallardDuck: Quackable = duckFactory.createMallardDuck()
    val redheadDuck: Quackable = duckFactory.createRedheadDuck()
    val duckCall: Quackable = duckFactory.createDuckCall()
    val rubberDuck: Quackable = duckFactory.createRubberDuck()
    val gooseDuck: Quackable = GooseAdapter(Goose())

    val flock: Flock = Flock()
    flock.add(redheadDuck)
    flock.add(duckCall)
    flock.add(rubberDuck)
    flock.add(gooseDuck)

    val flockOfMallardDuck: Flock = Flock()

    val mallardOne = duckFactory.createMallardDuck()
    val mallardTwo = duckFactory.createMallardDuck()
    val mallardThree = duckFactory.createMallardDuck()
    val mallardFour = duckFactory.createMallardDuck()

    flockOfMallardDuck.add(mallardOne)
    flockOfMallardDuck.add(mallardTwo)
    flockOfMallardDuck.add(mallardThree)
    flockOfMallardDuck.add(mallardFour)

    flock.add(flockOfMallardDuck)

    println("Duck Simulator: Whole Flock Simulation")
    simulate(flock)
    println("Duck Simulator: Mallard Flock Simulation")
    simulate(flockOfMallardDuck)

    println("The ducks quacked ${QuackCounter.numberOfQuacks} times")
}

fun simulate(duck: Quackable) {
    duck.quack()
}

fun main() {
    simulate(CountingDuckFactory())
}