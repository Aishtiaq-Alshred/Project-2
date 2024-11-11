import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Routes route1 = new Routes("Aflaj", "Riyadh", 100);
        Routes route2 = new Routes("Riyadh", "Aflaj", 150);

        Cars car1 = new Cars("Car1", route1, 5);
        Cars car2 = new Cars("Car2", route2, 0);

        Passengers[] passengers = new Passengers[2];
        passengers[0] = new SubscribersPassengers();
        passengers[1] = new NonSubscribersPassengers(true);

        passengers[0].name = "Aishtiaq";
        passengers[0].ID = 1116442797;
        passengers[1].name = "Mona";
        passengers[1].ID = 1116521644;

        try {
            passengers[0].reserveCar(car1);
            passengers[1].reserveCar(car2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        for (Passengers passenger : passengers) {
            passenger.displayInfo();
        }


    }
}