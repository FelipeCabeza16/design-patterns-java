import java.util.ArrayList;

public class Motorcycle extends Product implements Builder {

    public Motorcycle(ArrayList<String> parts) {
        super(parts);
        parts.add("Manubrio");
        parts.add("Partes de la moto");
    }

    @Override
    public void buildBody() {
        System.out.println("Building body motorcycle");
        
    }

    @Override
    public void insertWheels() {
        System.out.println("Inserting 2 wheels motorcycle");
        
    }

    @Override
    public void addHeadlights() {
        System.out.println("Adding headlights motorcycle");            
    }

    @Override
    public Product getVehicle() {
        ArrayList<String> partesDelaMoto = new ArrayList<String>();
        partesDelaMoto.add("2 llantas");
        partesDelaMoto.add("Burro");
        return new Motorcycle(partesDelaMoto);
    }
    
}
