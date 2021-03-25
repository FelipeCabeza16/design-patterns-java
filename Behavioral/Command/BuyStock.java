public class BuyStock implements Order {
    private Stock stock;

    @Override
    public void execute() {
        stock.buy();
    }

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

}
