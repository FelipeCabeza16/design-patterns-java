package Adapter;

public class MotorEconomico implements Motor {

    @Override
    public void encender() {
        System.out.println("Encender motor económico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar motor económico");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar motor económico");
    }

}
