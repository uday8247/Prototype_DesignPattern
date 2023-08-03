import java.util.ArrayList;
import java.util.List;

public class Showroom {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();  // List for Original objects
        List<Vehicle> vehiclesCopy = new ArrayList<>();  // List for cloned objects

        Bike b1 = new Bike(); // Demo Bike object
        b1.seats = 2;
        b1.tyres = 2;
        b1.color = "Black";
        b1.fuel = "Petrol";
        vehicles.add(b1);

        Car c1 = new Car(); // Demo Car object
        c1.seats = 4;
        c1.tyres = 4;
        c1.color = "Black";
        c1.fuel = "Diesel";
        vehicles.add(c1);

        for (Vehicle vehicle : vehicles) { // cloning each object of 'vehicles' list
            vehiclesCopy.add(vehicle.clone());
        }
        System.out.println("Original Objects :\n"); // Printing Original objects
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle.toString());
            System.out.println("----------------------------------------------------------");
        }

        System.out.println("Prototype Objects :\n"); // Printing Cloned objects
        for(Vehicle vehicle:vehiclesCopy){
            System.out.println(vehicle.toString());
            System.out.println("----------------------------------------------------------");
        }

    }
}
