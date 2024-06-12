package ibmec.edu.br.observer;
import java.util.ArrayList;
import java.util.List;
public class Observable {
    public List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
