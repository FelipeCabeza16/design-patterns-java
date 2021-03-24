public class Leaf extends Component {

    public Leaf(String nombre) {
        super(nombre);
    }

    public void add(Component c) {
        System.out.println("no se puede agregar la hoja");
    }

    public void remove(Component c) {
        System.out.println("no se puede quitar la hoja");
    }

    public void mostrar(int depth) {
		System.out.println('-' + "" + nombre);
    }
}
