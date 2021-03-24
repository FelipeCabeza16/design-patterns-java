import java.util.ArrayList;

public class Composite extends Component {
    ArrayList<Component> hijo = new ArrayList<Component>(); 
    
    public Composite(String nombre) {
        super(nombre);
    }

    @Override
    public void add(Component component) {
        hijo.add(component);
    }

    @Override
    public void remove(Component component) {
        hijo.remove(component);
    }

    @Override
    public void mostrar(int n) {
        for (Component component : hijo){
            System.out.println(component.nombre);
        }
    }


}
