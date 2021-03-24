public class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("Appling color triangle...");
        color.applyColor();
    }

}
