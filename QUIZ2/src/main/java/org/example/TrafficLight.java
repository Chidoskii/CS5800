package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

public class TrafficLight implements PropertyChangeListener {
    private SignalColors signalColor;
    private Random rand = new Random();
    private int randomNumber = rand.nextInt(10);


    public TrafficLight(SignalColors signalColor) {
        this.signalColor = signalColor;
    }
    public void setSignalColor(SignalColors signalColor) {
        this.signalColor = signalColor;
    }
    public SignalColors getSignalColor() {
        return signalColor;
    }
    public void changeSignalColor() throws InterruptedException {
        switch (signalColor) {
            case SignalColors.RED:
                randomNumber = 10 * rand.nextInt(10);
                Thread.sleep(randomNumber);
                setSignalColor(SignalColors.GREEN);
                break;

            case YELLOW:
                randomNumber = 10 * rand.nextInt(7);
                Thread.sleep(randomNumber);
                setSignalColor(SignalColors.RED);
                break;

            case GREEN:
                randomNumber = 10 * rand.nextInt(9);
                Thread.sleep(randomNumber);
                setSignalColor(SignalColors.YELLOW);
                break;
        }

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        signalColor = (SignalColors) evt.getNewValue();
    }
}
