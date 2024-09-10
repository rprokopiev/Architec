using static System.Runtime.InteropServices.JavaScript.JSType;
using System.Collections.Generic;

namespace _009_WebApp.Models
{
    /// <summary>
    /// To store list of measurements
    /// </summary>
    public class WeatherForecastHolder
    {
        private List<WeatherForecast> _values;

        
        public WeatherForecastHolder()
        {
            // Initialize collection to keep measurements
            _values = new List<WeatherForecast>();
        }


        /// <summary>
        /// To add new T-data
        /// </summary>
        /// <param name="dateTime"></param>
        /// <param name="temperatureC"></param>
        public void Add(DateTime dateTime, int temperatureC)
        {
            WeatherForecast forecast = new WeatherForecast();
            forecast.TemperatureC = temperatureC;
            forecast.Date = dateTime;

            _values.Add(forecast);
        }

        /// <summary>
        /// Update existing measurement
        /// </summary>
        /// <param name="date"></param>
        /// <param name="temperatureC"></param>
        /// <returns></returns>
        public bool Update(DateTime date, int temperatureC)
        {
            foreach (WeatherForecast item in _values)
            {
                if (item.Date == date)
                {
                    item.TemperatureC = temperatureC;
                    return true;
                }
            }
            return false;
        }

        /// <summary>
        /// Return measurement for the period
        /// </summary>
        /// <param name="dateFrom"></param>
        /// <param name="dateTo"></param>
        /// <returns></returns>
        public List<WeatherForecast> Get(DateTime dateFrom, DateTime dateTo)
        {
            List<WeatherForecast> list = new List<WeatherForecast>();
            foreach (WeatherForecast item in _values)
            {
                if (item.Date >= dateFrom && item.Date <= dateTo)
                {
                    list.Add(item);
                }
            }
            return list;
        }

        /// <summary>
        /// Delete measurement per date
        /// </summary>
        /// <param name="date"></param>
        /// <returns></returns>
        public bool Delete(DateTime date)
        {
            foreach (WeatherForecast item in _values)
            {
                if (item.Date == date)
                {
                    _values.Remove(item);
                    return true;
                }
            }
            return false;
        }

    }     
}
