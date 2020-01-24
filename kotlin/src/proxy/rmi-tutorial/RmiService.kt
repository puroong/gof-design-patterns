package proxy.`rmi-tutorial`

import java.io.IOException
import java.rmi.Naming
import java.rmi.registry.LocateRegistry

fun main() {
    try {
        var service: MyRemote = MyRemoteImpl()
        LocateRegistry.createRegistry(1102)
        Naming.rebind("rmi://localhost:1102/HelloKotlin", service)

        println("===================")
    } catch (e: IOException) {
        e.printStackTrace()
    }
}