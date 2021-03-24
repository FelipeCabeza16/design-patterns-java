abstract class Component {
    protected String nombre;
	public Component (String nombre)
	{
		this.nombre = nombre;
	}

    abstract public void add(Component component);
    abstract public void remove(Component component);
    abstract public void mostrar(int n);
}