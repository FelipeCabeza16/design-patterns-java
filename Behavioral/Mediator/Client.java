public class Client {
    
    public static void main(String[] args) {
        //NO NECESITAMOS A MEDIATOR
        ConctreteMediator cm = new ConctreteMediator(); 
        ComponentA cA = new ComponentA(cm);
        ComponentB cB = new ComponentB(cm);
        ComponentC cC = new ComponentC(cm);

        //DEFINIMOS LOS COMPONENTES EN EL MEDIADOR
        cm.setcA(cA);
        cm.setcB(cB);
        cm.setcC(cC);

        cm.notify(cB);
        cm.notify(cA);
        cm.notify(cC);
    }
}
