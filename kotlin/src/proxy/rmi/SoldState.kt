package proxy.rmi

class SoldState(@Transient val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("Please wait, we're already giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn't get you another gumball!")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.noQuarterState)
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.setState(gumballMachine.soldState)
        }
    }
}