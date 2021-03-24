public class Triangle extends Shape {

    public Triangle(String shapeName, int sides) {
        super();
        this.shapeName = shapeName;
        this.sides = sides;
    }

    @Override
    public Object clonar() {
        return this;
    }

    @Override
    public String getShape() {
        return this.shapeName;
    }

    @Override
    public int getSides() {
        return this.sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
