package com.epam.RationalRose;

public class CoolingChamber {
    private double maxTemperature;
    private double normalTemperaturePercent;
    private double currentTemperature;

    private Fridge fridge;
    private DoorOpeningSensor doorOpeningSensor;
    private Indicator indicator;
    private Motor motor;
    private TemperatureRegulator temperatureRegulator;
    private Termometer termometer;
    private Timer timer;
    private Beeper beeper;

    CoolingChamber(Fridge fridge){
        this.fridge = fridge;
        normalTemperaturePercent = 0.4;
    }

    public double getNormalTemperaturePercent() {
        return normalTemperaturePercent;
    }


    public void setNormalTemperaturePercent(double normalTemperaturePercent) {
        this.normalTemperaturePercent = normalTemperaturePercent;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Beeper getBeeper() {
        return beeper;
    }

    public void setBeeper(Beeper beeper) {
        this.beeper = beeper;
    }

    public DoorOpeningSensor getDoorOpeningSensor() {
        return doorOpeningSensor;
    }

    public void setDoorOpeningSensor(DoorOpeningSensor doorOpeningSensor) {
        this.doorOpeningSensor = doorOpeningSensor;
    }

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public TemperatureRegulator getTemperatureRegulator() {
        return temperatureRegulator;
    }

    public void setTemperatureRegulator(TemperatureRegulator temperatureRegulator) {
        this.temperatureRegulator = temperatureRegulator;
    }

    public Termometer getTermometer() {
        return termometer;
    }

    public void setTermometer(Termometer termometer) {
        this.termometer = termometer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public class Door{
        private boolean opened = false;

        public boolean isOpened() {
            return opened;
        }

        public void setOpened(boolean opened) {
            this.opened = opened;
        }

        public void open(){
            opened = true;
            doorOpeningSensor.observeDoor(this);
            fridge.getJournal().makeNotation("Door opened");
        }

        public void close(){
            opened = false;
            fridge.getJournal().makeNotation("Door closed");
        }
    }
}
