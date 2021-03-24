public class ConcreteCreator {

    public ConcreteCreator() {
        Product p1 = new Product1();
        p1.showProduct();
        Product p2 = new Product2();
        p2.showProduct();
    }

    public static void main(String[] args) {
        ConcreteCreator cc = new ConcreteCreator();
    }
}
