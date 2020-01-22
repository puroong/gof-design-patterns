package adapter.simple

fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}

fun main() {
    val duck: MallardDuck = MallardDuck()
    val turkey: WildTurkey = WildTurkey()
    val turkeyAdapter: TurkeyAdapter =
        TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("The Duck says...")
    testDuck(duck)

    println("The TurkeyAdapter says...")
    testDuck(turkeyAdapter)
}