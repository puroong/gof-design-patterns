package proxy.rmi

import kotlin.random.Random

class HasQuarterState(@Transient val gumballMachine: GumballMachine) : State {
    val randomwinner: Random = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.setState(gumballMachine.noQuarterState)
    }

    override fun turnCrank() {
        println("You turned...")
        val winner: Int = randomwinner.nextInt(10)
        if((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.winnerState)
        } else {
            gumballMachine.setState(gumballMachine.soldState)
        }
    }

    override fun dispense() {
        println("No gumball dispensed")
    }
}