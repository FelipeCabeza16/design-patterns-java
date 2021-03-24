public class Square extends Shape {

    public Square(String shapeName, int sides) {
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

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public int getSides() {
        return this.sides;
    }


}
