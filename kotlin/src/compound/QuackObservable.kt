package compound

interface QuackObservable {
    fun registerObserver(observer: Observer)
}