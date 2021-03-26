public class LogConsole implements LogStrategy {

    @Override
    public void escribir(String mensaje) {
        System.out.println("Escribiendo " + mensaje + " en la consola");

    }

}
