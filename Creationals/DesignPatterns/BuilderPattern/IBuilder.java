
/**
 * Implementacion de la interfaz comun.
 * 
 * @author Felipe Cabeza, Hollman Gonzalez 
 * @version 2021
 */
interface IBuilder
{
    void BuildBody();

    void InsertWheels();

    void AddHeadlights();

    Product GetVehicle();
}