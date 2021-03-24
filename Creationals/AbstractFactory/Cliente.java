public class Cliente {
    
    public static void main(String[] args) {
        GameboyAbstract g1 = new GameboyAbstract();
        NintendoDSAbstract n1 = new NintendoDSAbstract();

        //Moneda y bloque interrogante sin conocer el tipo
        BloqueInterrogante b1 =  g1.createBloqueInterrogante();
        Moneda m1 = n1.createMoneda();
    }
}
