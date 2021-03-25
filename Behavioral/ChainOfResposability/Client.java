package ChainOfResposability;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar");
        int cantidad = sc.nextInt();
        sc.close();

        ManejadorCambio mc50 = new Billete50();
        ManejadorCambio mc20 = new Billete20();
        ManejadorCambio mc10 = new Billete10();

        mc50.setNext(mc20);
        mc20.setNext(mc10);

        mc50.devuelveBilletes(cantidad);
    }
}
