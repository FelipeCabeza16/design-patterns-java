public class Client {
    public static void main(String[] args) {
        TcpOpen tOpen = new TcpOpen();
        TcpClose tClose = new TcpClose();
        TcpEstablished tEstablished = new TcpEstablished();

        TcpConnection connection = new TcpConnection(tOpen);
        //ABIERTA
        connection.setState(tOpen);
        System.out.println(connection.getState());
        tOpen.acknowledge(connection);
        //ESTABLECIDA
        connection.setState(tEstablished);
        System.out.println(connection.getState());
        //CERRADA
        connection.setState(tClose);
        System.out.println(connection.getState());
    }
}
