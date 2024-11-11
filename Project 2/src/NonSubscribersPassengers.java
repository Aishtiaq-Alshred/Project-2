public class NonSubscribersPassengers extends Passengers{
    boolean discountCoupon;

    public NonSubscribersPassengers(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Cars car) throws Exception {
        if (car.maxCapacity == 0) {
            throw new Exception("Car is full");
        }
        car.maxCapacity--;
        reservedCar = car;
        tripCost = car.route.price;
        if (discountCoupon) {
            tripCost = tripCost * 0.9;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Subscriber Passenger:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        if (reservedCar != null) {
            System.out.println("Car Code: " + reservedCar.code);
            System.out.println("Route Price: " + reservedCar.route.price);
            System.out.println("Trip Cost: " + tripCost);
        } else {
            System.out.println("No car reserved for this passenger.");
        }
    }

}



