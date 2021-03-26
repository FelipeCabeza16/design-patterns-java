public class Basket implements Juego {

    private int cuarto = 1;
    @Override
    public void start() {
        System.out.println("Comienza el partido");
    }

    @Override
    public void end() {
        System.out.println("Terminan el ultimo cuarto");
        
    }

    @Override
    public void rest() {
        System.out.println("Termina el " +this.cuarto + " cuarto");        
        cuarto++;
    }
    
}
