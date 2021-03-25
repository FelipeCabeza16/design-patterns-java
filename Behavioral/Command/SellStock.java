public class SellStock implements Order {
    private Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
    
    public SellStock(Stock stock) {
        this.stock = stock;
    }

}
