package obeserver.weathermonitoring

interface Observer {
    fun update(temperature: Double, humidity: Double, pressure: Double)
}