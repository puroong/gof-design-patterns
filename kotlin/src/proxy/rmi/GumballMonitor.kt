package proxy.rmi

class GumballMonitor(val machine: GumballMachineRemote) {
    fun report() {
        try {
            println("Gumball Machine: ${machine.getLocation()}")
            println("Current Inventory: ${machine.getCount()} gumballs")
            println("Current state: ${machine.getState()}")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}