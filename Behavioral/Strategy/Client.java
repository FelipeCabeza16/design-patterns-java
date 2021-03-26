public class Client {
    public static void main(String[] args) {
        LogStrategy log = new LogConsole();
        log.escribir("Hola");
        log = new LogTexto();
        log.escribir("mundo");
    }
}
