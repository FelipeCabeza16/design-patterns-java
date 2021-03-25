public class ComponentA extends Component {
    private Mediator m;

    public ComponentA(Mediator m) {
        this.setM(m);
    }
    void operationA(){
        System.out.println("Operation A");
    }

    public Mediator getM() {
        return m;
    }

    public void setM(Mediator m) {
        this.m = m;
    }

}
