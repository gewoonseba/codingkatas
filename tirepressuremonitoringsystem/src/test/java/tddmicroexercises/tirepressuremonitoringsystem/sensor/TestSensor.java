package tddmicroexercises.tirepressuremonitoringsystem.sensor;

public class TestSensor implements Sensor{

    private double returnValue;

    public void setReturnValue(double returnValue){
        this.returnValue = returnValue;
    }

    public double popNextPressurePsiValue() {
        return returnValue;
    }
}
