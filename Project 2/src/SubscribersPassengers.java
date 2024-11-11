public class SubscribersPassengers extends  Passengers{

    @Override
    public void reserveCar(Cars car) throws Exception {
        if (car.maxCapacity == 0) {
            throw new Exception("Car is full");
        }
        car.maxCapacity--;
        reservedCar = car;
        tripCost = car.route.price * 0.5;
    }

    @Override
    public void displayInfo() {
        System.out.println("Subscriber Passenger:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Car Code: " + reservedCar.code);
        System.out.println("Route Price: " + reservedCar.route.price);
        System.out.println("Trip Cost: " + tripCost);
    }


}
