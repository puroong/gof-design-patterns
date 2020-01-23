package state

class GumballMachine(var count: Int) {
    val soldOutState: State = SoldOutState(this)
    val noQuarterState: State = NoQuarterState(this)
    val hasQuarterState: State = HasQuarterState(this)
    val soldState: State = SoldState(this)
    val winnerState: State = WinnerState(this)

    var state: State = soldOutState

    init {
        if (count > 0) {
            state = noQuarterState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot")
        if (count != 0) {
            count -= 1
        }
    }

    fun refill() {
        this.count = count
        state = noQuarterState
    }
}