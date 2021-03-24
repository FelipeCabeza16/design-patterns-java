import java.util.LinkedList;
/**
 * Product to been created.
 * 
 * @author Felipe Cabeza, Hollman Gonzalez 
 * @version 2021
 */
class Product
{
    // We can use any data structure that you prefer. We have used LinkedList here.
    private LinkedList<String> parts;
    public Product()
    {
        parts = new LinkedList<String>();
    }

    public void Add(String part)
    {
        //Adding parts
        parts.addLast(part);
    }

    public void Show()
    {
        System.out.println("\n Product completed as below :");
        for(int i=0;i<parts.size();i++)
        {
            System.out.println(parts.get(i));
        }
    }
}