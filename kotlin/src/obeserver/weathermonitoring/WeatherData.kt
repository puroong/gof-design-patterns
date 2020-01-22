package obeserver.weathermonitoring

class WeatherData : Subject {
    private val observers: MutableList<Observer> = ArrayList<Observer>()
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0
    private var pressure: Double = 0.0

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i: Int = observers.indexOf(o)
        if (i >= 0)
            observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}