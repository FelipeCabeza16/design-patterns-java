public class Client {

    public static void main(String[] args) {
        Shape s1 = new Square("Cuadrado", 4);
        Shape s2 = (Shape) s1.clonar();
        Shape s3 = new Triangle("Triángulo", 3);
        Shape s4 = (Shape) s3.clonar();

        System.out.println(s2.getShape());
        System.out.println(s2.getSides());

        System.out.println(s4.getShape());
        System.out.println(s4.getSides());
    }
}
