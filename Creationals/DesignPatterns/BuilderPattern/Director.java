/**
 * Contruye un objeto usando la interfaz IBuilder.
 * 
 * @author Felipe Cabeza, Hollman Gonzalez 
 * @version 2021
 */

class Director
{
    IBuilder myBuilder;
    // A series of steps—for the production
    public void Construct(IBuilder builder)
    {
        myBuilder=builder;
        myBuilder.BuildBody();
        myBuilder.InsertWheels();
        myBuilder.AddHeadlights();
    }
}

