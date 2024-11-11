public abstract class Passengers {

    String name;
    int ID;
    Cars reservedCar;
    double tripCost;

    public abstract void reserveCar(Cars car) throws Exception;

    public abstract void displayInfo();
}
