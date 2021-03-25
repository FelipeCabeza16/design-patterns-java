public class Client {
    
    public static void main(String[] args) {
        Subject p = new Proxy();
        //NO LLAMA DIRECTAMENTE AL DOCUMENTO REAL 
        
        p.createDocument();
    }
}
