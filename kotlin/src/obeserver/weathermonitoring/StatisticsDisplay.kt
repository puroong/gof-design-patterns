package obeserver.weathermonitoring

class StatisticsDisplay(private var weatherData: Subject) : Observer, DisplayElement {
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0
    private var pressure: Double = 0.0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = $temperature/$humidity/$pressure")
    }

}