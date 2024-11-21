package org.example;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class Vehicle {
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private SignalColors signalColor;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setSignalColor(SignalColors color) {
        support.firePropertyChange("signal", this.signalColor, color);
        this.signalColor = color;
    }
}
