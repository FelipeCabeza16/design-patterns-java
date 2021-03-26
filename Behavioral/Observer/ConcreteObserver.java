public class ConcreteObserver implements Observer {
    private String nombre;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String nombre, ConcreteSubject concreteSubject) {
        this.setNombre(nombre);
        this.concreteSubject = concreteSubject;
    }


    @Override
    public void update() {
        this.setObserverState(concreteSubject.getState());
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
