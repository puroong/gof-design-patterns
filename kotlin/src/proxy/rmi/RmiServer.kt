package proxy.rmi

import java.rmi.Naming

fun main() {
    try {
        val count = 100
        val gumballMachine: GumballMachineRemote = GumballMachine("localhost", count)
        Naming.rebind("//localhost/gumballmachine", gumballMachine)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}