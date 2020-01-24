package proxy.rmi

import java.rmi.server.UnicastRemoteObject

class GumballMachine(private var _location: String, private var _count: Int) : UnicastRemoteObject(), GumballMachineRemote {
    val soldOutState: State = SoldOutState(this)
    val noQuarterState: State = NoQuarterState(this)
    val hasQuarterState: State = HasQuarterState(this)
    val soldState: State = SoldState(this)
    val winnerState: State = WinnerState(this)

    private var _state: State = soldOutState

    init {
        if (_count > 0) {
            _state = noQuarterState
        }
    }

    fun insertQuarter() {
        _state.insertQuarter()
    }

    fun ejectQuarter() {
        _state.ejectQuarter()
    }

    fun turnCrank() {
        _state.turnCrank()
        _state.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot")
        if (_count != 0) {
            _count -= 1
        }
    }

    fun refill() {
        this._count = 0
        _state = noQuarterState
    }

    fun setState(state: State) {
        _state = state
    }

    override fun getCount(): Int {
        return _count
    }

    override fun getLocation(): String {
        return _location
    }

    override fun getState(): State {
        return _state
    }
}