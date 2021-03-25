package ChainOfResposability;

public class Billete50 extends ManejadorCambio {
    private static int CANTIDAD = 50000;
    @Override
    void devuelveBilletes(int cantidad) {
        if (cantidad - Billete50.CANTIDAD >= 0){
            cantidad-=Billete50.CANTIDAD;
            System.out.println("Billete de " + Billete50.CANTIDAD);
            devuelveBilletes(cantidad);
        } else {
            getNext().devuelveBilletes(cantidad);
        }
        
    }
    
}
