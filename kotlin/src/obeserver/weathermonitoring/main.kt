package obeserver.weathermonitoring

fun main() {
    val weatherData: WeatherData = WeatherData()

    val currentDisplay: CurrentConditionDisplay = CurrentConditionDisplay(weatherData)
    val statisticsDisplay: StatisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay: ForecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(80.0, 65.0, 30.4)
    weatherData.setMeasurements(82.0, 70.0, 29.2)
    weatherData.setMeasurements(78.0, 90.0, 29.2)
}