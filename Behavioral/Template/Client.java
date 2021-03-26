public class Client {
    public static void main(String[] args) {
        Juego j1 = new Futbol();
        Juego j2 = new Basket();

        j1.start();
        j1.rest();
        j1.end();

        j2.start();
        j2.rest();
        j2.rest();
        j2.rest();
        j2.end();

    }
}
