package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private final int HOTTEMPERATURE = 30;
    private final int COLDTEMPERATURE = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, check1(), check2(), newTemp());
    }

    private String check1() {
        if (location.equals("London")) {

            return "🌦";

        } else if (location.equals("California")){

            return "🌅";

        } else if (location.equals("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }

    private String check2() {
        if (temperature > HOTTEMPERATURE) {

            return "It's too hot 🥵!";

        } else if (temperature < COLDTEMPERATURE) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

    private double newTemp(){
        return (9.0 / 5.0) * temperature + 32;
    }
}
