public class Proxy implements Subject {

    @Override
    public void createDocument() {
        System.out.println("Llamando al proxy");
        RealSubject rs = new RealSubject();

        //aqui se puede poner una condición, ejemplo si las credenciales son válidas
        rs.createDocument();
    }
    
}
