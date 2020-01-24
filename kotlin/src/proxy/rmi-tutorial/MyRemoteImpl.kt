package proxy.`rmi-tutorial`

import java.rmi.server.UnicastRemoteObject

class MyRemoteImpl : UnicastRemoteObject(), MyRemote {
    override fun sayHello(): String {
        return "Server says, 'Hey'"
    }
}