public class TcpClose implements TcpState {

    @Override
    public void open(TcpConnection context) {
        System.out.println("Tcp closed - open");
        context.setState(this);
    }

    @Override
    public void close(TcpConnection context) {
        System.out.println("Tcp closed - close");
        context.setState(this);

    }

    @Override
    public void acknowledge(TcpConnection context) {
        System.out.println("Tcp closed - acknowledge");
        context.setState(this);

    }

    @Override
    public String toString() {
        return "Cerrada";
    }

}
