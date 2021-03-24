public class RedShape extends ShapeDecorator {

    public RedShape(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void getShapeInfo() {
        System.out.println("Figura roja");
    }

    public void paint(){
        System.out.println("Coloreando de rojo");
    }
    
}
