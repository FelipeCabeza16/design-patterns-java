import java.util.ArrayList;

public class Car extends Product implements Builder {

    public Car(ArrayList<String> parts) {
        super(parts);
        this.add("Partes de un carro");
    }

    @Override
    public void buildBody() {
        System.out.println("Building body car");
        
    }

    @Override
    public void insertWheels() {
        System.out.println("Inserting 4 wheels car");
        
    }

    @Override
    public void addHeadlights() {
        System.out.println("Adding headlights car");        
    }

    @Override
    public Product getVehicle() {
        ArrayList<String> partesDelCarro = new ArrayList<String>();
        partesDelCarro.add("4 llantas");
        partesDelCarro.add("Puertas");
        return new Car(partesDelCarro);
    }
    
}
