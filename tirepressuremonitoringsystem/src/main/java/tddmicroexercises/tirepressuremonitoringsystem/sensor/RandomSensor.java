package tddmicroexercises.tirepressuremonitoringsystem.sensor;

import java.util.Random;

// The reading of the pressure value from the randomSensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class RandomSensor implements Sensor {
    public static final double OFFSET = 16;

    public double popNextPressurePsiValue() {
        double pressureTelemetryValue;
        pressureTelemetryValue = samplePressure( );

        return OFFSET + pressureTelemetryValue;
    }

    private static double samplePressure() {
        // placeholder implementation that simulate a real randomSensor in a real tire
        Random basicRandomNumbersGenerator = new Random();
        double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
        return pressureTelemetryValue;
    }
}
