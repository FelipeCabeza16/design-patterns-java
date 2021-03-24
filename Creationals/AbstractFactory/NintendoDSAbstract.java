public class NintendoDSAbstract implements AbstractFacctory {

    @Override
    public Moneda createMoneda() {
        return new MonedaNintendoDS();
    }

    @Override
    public BloqueInterrogante createBloqueInterrogante() {
        return new BloqueInterroganteNintendoDS();
    }
    
}
