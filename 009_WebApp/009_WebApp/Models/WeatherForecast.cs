namespace _009_WebApp.Models
{   
    /// <summary>
    /// Прогноз погоды Forecast
    /// </summary>
    public class WeatherForecast
    {
        /// <summary>
        /// Date
        /// </summary>
        public DateTime Date { get; set; }

        /// <summary>
        /// Degrees per Celsius
        /// </summary>
        public int TemperatureC { get; set; }

        /// <summary>
        /// Degrees per Fahrenheit
        /// </summary>
        public int TemperatureF
        {
            get { return 32 + (int)(TemperatureC / 0.5556); }
        }


    }
}
