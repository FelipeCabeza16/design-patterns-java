public class ConctreteMediator implements Mediator {

    private ComponentA cA;
    private ComponentB cB;
    private ComponentC cC;

    @Override
    public void notify(Component sender) {
        if (sender == cA) {
            reactOnA();
        } else if (sender == cB) {
            reactOnB();
        } else if (sender == cC){
            reactOnC();
        }
    }

    public ComponentC getcC() {
        return cC;
    }

    public void setcC(ComponentC cC) {
        this.cC = cC;
    }

    public ComponentB getcB() {
        return cB;
    }

    public void setcB(ComponentB cB) {
        this.cB = cB;
    }

    public ComponentA getcA() {
        return cA;
    }

    public void setcA(ComponentA cA) {
        this.cA = cA;
    }

    void reactOnA() {
        System.out.println("Reacting on A");
    }

    void reactOnB() {
        System.out.println("Reacting on B");
    }

    void reactOnC() {
        System.out.println("Reacting on C");
    }
}
