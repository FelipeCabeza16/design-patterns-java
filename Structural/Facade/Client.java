public class Client {
    public static void main(String[] args) {
        Order w1 = new Waiter();
        Order c1 = new Chef();

        w1.order();
        c1.order();
    }
}
