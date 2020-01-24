package proxy.raw

import proxy.raw.GumballMachine

class GumballMonitor(val gumballMachine: GumballMachine) {
    fun report() {
        println("Gumball Machine: ${gumballMachine.location}")
        println("Current inventory: ${gumballMachine.count} gumballs")
        println("Current State: ${gumballMachine.state}")
    }
}