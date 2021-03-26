public class TcpOpen implements TcpState {

    @Override
    public void open(TcpConnection context) {
        System.out.println("Tcp TcpEstablished - open");        
        context.setState(this);
    }

    @Override
    public void close(TcpConnection context) {
        System.out.println("Tcp TcpEstablished - close");        
        context.setState(this);
    }

    @Override
    public void acknowledge(TcpConnection context) {
        System.out.println("Tcp TcpEstablished - acknowledge");        
        context.setState(this);
    }
    @Override
public String toString() {
    return "Abierta";
}
}
