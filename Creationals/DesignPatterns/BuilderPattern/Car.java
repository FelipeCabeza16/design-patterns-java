
/**
 * Car concrete builder.
 * 
 * @author Felipe Cabeza, Hollman Gonzalez 
 * @version 2021
 */
class Car implements IBuilder
{
    private Product product = new Product();

    @Override
    public void BuildBody()
    {
        product.Add("This is a body of a Car");
    }

    @Override
    public void InsertWheels()
    {
        product.Add("4 wheels are added");
    }

    @Override
    public void AddHeadlights()
    {
        product.Add("2 Headlights are added");
    }

    @Override
    public Product GetVehicle()
    {
        return product;
    }
}