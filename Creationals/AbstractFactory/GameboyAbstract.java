public class GameboyAbstract implements AbstractFacctory {

    @Override
    public Moneda createMoneda() {
        return new MonedaGameboy();
    }

    @Override
    public BloqueInterrogante createBloqueInterrogante() {
        return new BloqueInterroganteGameboy();
    }
    
}
