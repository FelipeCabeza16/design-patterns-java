package ChainOfResposability;

public class Client {
    public static void main(String[] args) {
        int cantidad = 120000;
        ManejadorCambio mc50 = new Billete50();
        ManejadorCambio mc20 = new Billete20();
        ManejadorCambio mc10 = new Billete10();

        mc50.setNext(mc20);
        mc20.setNext(mc10);

        mc50.devuelveBilletes(cantidad);
    }
}
