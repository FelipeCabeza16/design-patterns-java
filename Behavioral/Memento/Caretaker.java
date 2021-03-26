import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    void add(Memento m){
        this.mementos.add(m);
    }
    Memento get(int index){
        return this.mementos.get(index);
    }
}
