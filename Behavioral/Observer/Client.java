public class Client {
    public static void main(String[] args) {
        ConcreteSubject y1 = new ConcreteSubject("Youtuber 1");
        ConcreteObserver o1 = new ConcreteObserver("Suscriptor 1", y1);
        ConcreteObserver o2 = new ConcreteObserver("Suscriptor 2", y1);

        // SUSCRIBIMOS
        y1.attach(o1);
        y1.attach(o2);

        y1.setState("Nuevo video de terror");
        y1.notifyListeners();

        // MUESTRA EL VIDEO A LOS OBSERVADORES
        System.out.println("Observador "+ o1.getNombre() + " " +o1.getObserverState());
        System.out.println("Observador "+ o2.getNombre() + " " +o2.getObserverState());

        // QUITAMOS EL PRIMER SUSCRIPTOR
        y1.detatch(o1);
        y1.setState("Nuevo video de deportes");

        y1.notifyListeners();

        System.out.println("Observador "+ o1.getNombre() + " " +o1.getObserverState());
        System.out.println("Observador "+ o2.getNombre() + " " +o2.getObserverState());

    }
}
