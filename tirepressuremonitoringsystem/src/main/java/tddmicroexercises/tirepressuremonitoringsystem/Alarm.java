package tddmicroexercises.tirepressuremonitoringsystem;

import tddmicroexercises.tirepressuremonitoringsystem.sensor.Sensor;

public class Alarm
{
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    private Sensor sensor;

    boolean alarmOn = false;

    public Alarm(Sensor sensor){
        this.sensor = sensor;
    }

    public void check()
    {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }
}
