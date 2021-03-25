package ChainOfResposability;

public class Billete10 extends ManejadorCambio {
    private static int CANTIDAD = 10000;
    @Override
    void devuelveBilletes(int cantidad) {
        if (cantidad - Billete10.CANTIDAD >= 0){
            cantidad-=Billete10.CANTIDAD;
            System.out.println("Billete de " + Billete10.CANTIDAD);
            devuelveBilletes(cantidad);
        } else {
            System.out.println("Sobra " + cantidad);
        }
        
    }
    
}
