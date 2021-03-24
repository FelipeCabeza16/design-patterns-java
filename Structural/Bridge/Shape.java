abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();

}