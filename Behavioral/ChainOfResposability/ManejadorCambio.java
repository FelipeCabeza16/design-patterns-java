package ChainOfResposability;

abstract public class ManejadorCambio {
    
    protected ManejadorCambio manejadorCambio;
    void setNext(ManejadorCambio mc){
        this.manejadorCambio = mc;
    }
    ManejadorCambio getNext(){
        return this.manejadorCambio;
    }
    abstract void devuelveBilletes(int cantidad);
}
