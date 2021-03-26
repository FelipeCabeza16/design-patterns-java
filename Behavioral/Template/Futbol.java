public class Futbol implements Juego {

    @Override
    public void start() {
        System.out.println("Comienza el partido");
    }

    @Override
    public void end() {
        System.out.println("Terminan los 90 minutos");
        
    }

    @Override
    public void rest() {
        System.out.println("Primeros 45 minutos");        
    }
    
}
