package obeserver.weathermonitoring

class CurrentConditionDisplay(private var weatherData: Subject) : Observer, DisplayElement {
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }

}