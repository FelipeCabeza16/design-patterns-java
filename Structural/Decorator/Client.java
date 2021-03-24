public class Client {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape redTriangle = new RedShape(new Triangle());
        triangle.getShapeInfo();
        redTriangle.getShapeInfo();        
        
    }
}
