import java.util.ArrayList;

public class Director {
    Builder myBuilder;

    void construct(Builder builder) {

        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }

    public static void main(String[] args) {
        Director d = new Director();

        Car c1 = new Car(new ArrayList<String>());
        d.construct(c1);
        c1.show();

        Motorcycle m1 = new Motorcycle(new ArrayList<String>());
        d.construct(m1);
        m1.show();
    }
}
