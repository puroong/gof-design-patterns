package obeserver.weathermonitoring

class ForecastDisplay(private var weatherData: WeatherData) : Observer, DisplayElement {
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0
    private var pressure: Double = 0.0
    private var temperatureDiff: Double = 0.0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        this.temperatureDiff = temperature - this.temperature
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    fun heatIndex(): Double {
        return (16.923 + 1.85212 * 10 - 1 * temperature + 5.37941 * humidity - 1.00254 * 10 - (1 * temperature
                * humidity) + 9.41695 * 10 - 3 * temperature * temperature + 7.28898 * 10 - 3 * humidity * humidity + 3.45372 * 10 - (4
                * temperature * temperature * humidity * humidity) - 8.14971 * 10 - 4 * temperature * humidity * humidity + 1.02102 * 10 - 5 * temperature * temperature * humidity * humidity - 3.8646 * 10 - 5 * temperature * temperature * temperature + 2.91583 * 10 - 5 * humidity * humidity * humidity + 1.42721 * 10 - 6 * temperature * temperature * temperature * humidity
                + 1.97483 * 10) - 7 * temperature * humidity * humidity * humidity - 2.18429 * 10 - 8 * temperature * temperature * temperature * humidity * humidity + 8.43296 *
                10 - 10 * temperature * temperature * humidity * humidity * humidity - 4.81975 * 10 - 11 * temperature * temperature * temperature * humidity * humidity * humidity
    }

    override fun display() {
        println("Heat index is ${heatIndex()}")
    }

}