package Adapter;

public class MotorElectrico extends MotorElectricoAdapter {
    public void conectar() {
        System.out.println("Conectar");
    }

    public void activar() {
        System.out.println("Activar");

    }

    public void desconectar() {
        System.out.println("Desconectar");
    }

}
