package org.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Truck extends Vehicle {
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private SignalColors signalColor;
    private String vehicleType = "Truck";
    private Behavior drivingStyle = Behavior.NORMAL;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setSignalColor(SignalColors color) {
        support.firePropertyChange("signal", this.signalColor, color);
        this.signalColor = color;
    }

    public SignalColors getSignalColor() {
        return signalColor;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Behavior getDrivingStyle() {
        return drivingStyle;
    }

    public void setDrivingStyle(Behavior drivingStyle) {
        this.drivingStyle = drivingStyle;
    }

    public void responseToSignalColor(Behavior behavior){
        System.out.println("Vehicle Type: " + getVehicleType());
        switch (behavior){
            case NORMAL:
                if (getSignalColor() == SignalColors.RED) {
                    System.out.println("Response to signal change: Stop");
                }
                if (getSignalColor() == SignalColors.YELLOW) {
                    System.out.println("Response to signal change: Slow");
                }
                if (getSignalColor() == SignalColors.GREEN) {
                    System.out.println("Response to signal change: Go");
                }
                break;
            case PASSIVE:
                if (getSignalColor() == SignalColors.RED) {
                    System.out.println("Response to signal change: Stop");
                }
                if (getSignalColor() == SignalColors.YELLOW) {
                    System.out.println("Response to signal change: Slower");
                }
                if (getSignalColor() == SignalColors.GREEN) {
                    System.out.println("Response to signal change: Go Slow");
                }
                break;
            case AGGRESSIVE:
                if (getSignalColor() == SignalColors.RED) {
                    System.out.println("Response to signal change: Slam Brake");
                }
                if (getSignalColor() == SignalColors.YELLOW) {
                    System.out.println("Response to signal change: Faster");
                }
                if (getSignalColor() == SignalColors.GREEN) {
                    System.out.println("Response to signal change: Need4Speed");
                }
                break;
        }

    }
}
