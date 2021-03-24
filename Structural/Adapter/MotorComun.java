package Adapter;

public class MotorComun implements Motor {

    @Override
    public void encender() {
        System.out.println("Encender motor común");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar motor común");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar motor común");
    }

}
