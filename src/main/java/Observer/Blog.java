package Observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

    private List<Observer> observers;
    private String title;

    public Blog() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(title);
        }
    }

    public void setTitle(String title) {
        this.title = title;
        notifyObservers();
    }
}
