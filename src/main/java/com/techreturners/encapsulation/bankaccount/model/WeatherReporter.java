package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private final int HOT_TEMPERATURE = 30;
    private final int COLD_TEMPERATURE = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, retrieveWeatherByLocation(), retrieveTemperatureStatus(), celsiusToFahrenheit());
    }

    private String retrieveWeatherByLocation() {
        if (location.equals("London")) {

            return "🌦";

        } else if (location.equals("California")){

            return "🌅";

        } else if (location.equals("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }

    private String retrieveTemperatureStatus() {
        if (temperature > HOT_TEMPERATURE) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMPERATURE) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

    private double celsiusToFahrenheit(){
        return (9.0 / 5.0) * temperature + 32;
    }
}
