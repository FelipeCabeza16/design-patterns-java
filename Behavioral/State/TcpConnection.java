public class TcpConnection {
    private TcpState state;

    public TcpConnection(TcpState state) {
        this.setState(state);
    }

    public TcpState getState() {
        return state;
    }

    public void setState(TcpState state) {
        this.state = state;
    }
    
}
