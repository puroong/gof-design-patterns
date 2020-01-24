package proxy.raw

import proxy.raw.GumballMachine
import proxy.raw.State

class WinnerState(val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ejectQuarter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun turnCrank() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dispense() {
        println("YOU'RE A WINNER! You get two gumballs for you quarter")
        gumballMachine.releaseBall()
        if (gumballMachine.count == 0) {
            gumballMachine.state = gumballMachine.soldOutState
        } else {
            gumballMachine.releaseBall()
            if (gumballMachine.count > 0) {
                gumballMachine.state = gumballMachine.noQuarterState
            } else {
                println("Oops, out of gumballs")
                gumballMachine.state = gumballMachine.soldOutState
            }
        }
    }
}