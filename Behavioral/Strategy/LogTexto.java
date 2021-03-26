public class LogTexto implements LogStrategy {

    @Override
    public void escribir(String mensaje) {
        System.out.println("Escribiendo "+ mensaje + " en un archivo de texto");        
    }
    
}
