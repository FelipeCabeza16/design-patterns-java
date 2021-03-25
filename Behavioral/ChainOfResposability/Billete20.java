package ChainOfResposability;

public class Billete20 extends ManejadorCambio {
    private static int CANTIDAD = 20000;
    @Override
    void devuelveBilletes(int cantidad) {
        if (cantidad - Billete20.CANTIDAD >= 0){
            cantidad-=Billete20.CANTIDAD;
            System.out.println("Billete de " + Billete20.CANTIDAD);
            devuelveBilletes(cantidad);
        } else {
            getNext().devuelveBilletes(cantidad);
        }
        
    }
    
}
