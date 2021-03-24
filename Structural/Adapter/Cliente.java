package Adapter;

public class Cliente {
    
    public static void main(String[] args) {
        MotorElectrico m = new MotorElectrico();

        //DE MOTOR ELÉCTRICO 
        m.conectar();
        m.activar();
        m.desconectar();

        //DEL TARGET
        m.encender();
        m.acelerar();
        m.apagar();
    }
    
}
