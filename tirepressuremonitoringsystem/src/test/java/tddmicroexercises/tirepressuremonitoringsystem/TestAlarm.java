package tddmicroexercises.tirepressuremonitoringsystem;


import org.junit.*;
import tddmicroexercises.tirepressuremonitoringsystem.sensor.TestSensor;

import static org.junit.Assert.*;

public class TestAlarm {

    @Test
    public void testDefault() {
        TestSensor sensor = new TestSensor();
        Alarm alarm = new Alarm(sensor);
        assertEquals(false, alarm.isAlarmOn());
    }

    @Test
    public void testLow(){
        TestSensor sensor = new TestSensor();
        Alarm alarm = new Alarm(sensor);

        sensor.setReturnValue(16.99);
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());
    }

    @Test
    public void testHigh(){
        TestSensor sensor = new TestSensor();
        Alarm alarm = new Alarm(sensor);

        sensor.setReturnValue(21.01);
        alarm.check();
        assertEquals(true, alarm.isAlarmOn());
    }

    @Test
    public void testNoAlarm(){
        TestSensor sensor = new TestSensor();
        Alarm alarm = new Alarm(sensor);

        sensor.setReturnValue(17);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());

        sensor.setReturnValue(21);
        alarm.check();
        assertEquals(false, alarm.isAlarmOn());
    }
}
