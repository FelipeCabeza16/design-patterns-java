public class Originator {
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento saveStateFromMemento(){
        return new Memento(state);
    }

    void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    } 
}
