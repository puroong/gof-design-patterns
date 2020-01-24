package proxy.`rmi-tutorial`

import java.net.MalformedURLException
import java.rmi.Naming
import java.rmi.NotBoundException
import java.rmi.RemoteException

fun main() {
    try {
        val service: MyRemote = Naming.lookup("rmi://localhost:1102/HelloKotlin") as MyRemote
        val response: String = service.sayHello()

        println("response: ${response}")
    } catch (e: NotBoundException) {
        e.printStackTrace()
    } catch (e: RemoteException) {
        e.printStackTrace()
    } catch (e: MalformedURLException) {
        e.printStackTrace()
    } catch (e: TypeCastException) {
        e.printStackTrace()
    }
}