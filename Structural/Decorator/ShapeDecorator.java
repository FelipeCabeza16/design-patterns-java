abstract class ShapeDecorator implements Shape {

    //HEREDA DE UN COMPONENTE Y TIENE UN COMPONENTE PARA COMBINAR DECORADORES (capas) 
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
       this.decoratedShape = decoratedShape;
    }

    public void getShapeInfo(){
        this.decoratedShape.getShapeInfo();
    }
}
