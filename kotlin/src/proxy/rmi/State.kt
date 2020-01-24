package proxy.rmi

import java.io.Serializable

interface State : Serializable {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()
}