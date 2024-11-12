package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {
    protected String position;
    protected String destination;
    protected int timeBeforeArrival;
    protected List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public boolean notifyObservers() {
        for (Observer observer : this.observers)
            observer.update(this);
        return !observers.isEmpty();
    }

    public void setData(String position, String destination, int timeBeforeArrival) {
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = timeBeforeArrival;
        notifyObservers();
    }

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }
}
