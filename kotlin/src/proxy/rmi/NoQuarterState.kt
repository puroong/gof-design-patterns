package proxy.rmi

class NoQuarterState(@Transient val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("You inserted a quarter")
        gumballMachine.setState(gumballMachine.hasQuarterState)
    }

    override fun ejectQuarter() {
        println("You havent' inserted a quarter")
    }

    override fun turnCrank() {
        println("You turned, but there's no quarter")
    }

    override fun dispense() {
        println("You need to pay first")
    }
}