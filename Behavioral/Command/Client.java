public class Client {

    public static void main(String[] args) {
        Stock s1 = new Stock("Carnes", 5);
        BuyStock buyStock = new BuyStock(s1);

        Stock s2 = new Stock("Bebidas", 10);
        SellStock sellStock = new SellStock(s2);

        Broker b = new Broker();
        b.takeOrder(buyStock);
        b.takeOrder(sellStock);

        b.placeOrders();
    }
}
