package proxy.rmi

import java.lang.Exception
import java.rmi.Naming

fun main() {
    val location = "rmi://localhost/gumballmachine"

    try {
        val machine: GumballMachineRemote = Naming.lookup(location) as GumballMachineRemote
        val monitor = GumballMonitor(machine)
        println(machine)
        monitor.report()
        monitor.report()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}