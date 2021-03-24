public class Client {
    public static void main(String[] args) {
        Composite raiz = new Composite("root");
        raiz.add(new Leaf("Leaf A"));
        raiz.add(new Leaf("Leaf B"));
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        raiz.add(comp);
        raiz.add(new Leaf("Leaf C"));
        Leaf l = new Leaf("Leaf D");
        raiz.add(l);
        raiz.remove(l);
        raiz.mostrar(1);
    }
}
