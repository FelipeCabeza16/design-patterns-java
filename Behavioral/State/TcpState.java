interface TcpState {
    void open(TcpConnection context);
    void close(TcpConnection context);
    void acknowledge(TcpConnection context);
}