import java.util.ArrayList;

public class Product {
    private ArrayList<String> parts;

    public Product(ArrayList<String> parts) {
        this.parts = new ArrayList<String>();
    }

    public ArrayList<String> getParts() {
        return parts;
    }

    public void setParts(ArrayList<String> parts) {
        this.parts = parts;
    }

    public void add(String part){
        this.parts.add(part);
    }
    public void show(){
        for (String part : parts){
            System.out.println(part);
        }
    }
}
