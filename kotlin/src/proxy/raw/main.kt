package proxy.raw

import proxy.raw.GumballMachine
import proxy.raw.GumballMonitor
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var count: Int = 0

    if (args.size < 2) {
        println("GumballMachine <name> <inventory>")
        exitProcess(1)
    }

    count = Integer.parseInt(args[1])
    val gumballMachine: GumballMachine =
        GumballMachine(args[0], count)
    val gumballMonitor: GumballMonitor =
        GumballMonitor(gumballMachine)

    gumballMonitor.report()
}