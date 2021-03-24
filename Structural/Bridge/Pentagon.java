public class Pentagon extends Shape {

    Pentagon(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("Appling color pentagon...");        
        color.applyColor();
    }
    
}
