package com.streamapi.iotsensorreading;

import java.util.*;
import java.util.stream.*;

public class IOTSensor {
	public static void main(String[] args) {

        List<SensorReading> readings = Arrays.asList(
                new SensorReading("S1", 45.5),
                new SensorReading("S2", 78.2),
                new SensorReading("S3", 30.0),
                new SensorReading("S4", 90.3)
        );

        double threshold = 50.0;
        
        readings.stream()
        .filter(reading -> reading.getValue() > threshold)
        .forEach(reading ->
                System.out.println(
                        reading.getSensorId() + " : " + reading.getValue()
                )
        );
	}
}
