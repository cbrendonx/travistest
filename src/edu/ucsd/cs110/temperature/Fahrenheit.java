package edu.ucsd.cs110.temperature;

/**
 * Created by Cbrendonx on 2/15/17.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit( float t ) {
        super( t );
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius( (((getValue() - 32) * 5) / 9));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString() {
        // TODO: Complete this method
        return getValue() + " F";
    }
}
