package Study_Java.Task6;

public class Processor {
    private String model;
    private double clockSpeed;
    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }
    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}
