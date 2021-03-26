import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    private String state;
    private String nombre;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detatch(Observer o) {
        observers.remove(o);
    }

    public void notifyListeners() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ConcreteSubject(String nombre) {
        this.nombre = nombre;
    }

}
