package Entity;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int floor;
    private List<ParkingSpot> parkingSpots;

    public Level(int floor, int spots) {
        this.floor = floor;
        parkingSpots = new ArrayList<>();
        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;
        int numBikes = (int) (spots * spotsForBikes);
        int numCars = (int) (spots * spotsForCars);

        for(int i=0;i<=numCars;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.CAR));
        }
        for(int i=0;i<=numBikes;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.BIKE));
        }
        for(int i=numCars+numBikes;i<=spots;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.TRUCK));
        }
    }
    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType()) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable() && spot.getParkedVehicle() == vehicle) {
                spot.unParkedVehicle();
                return true;
            }
        }
        return false;
    }
    public void displayAvailability() {
        System.out.println("Level " + floor + " Availability:");
        for (ParkingSpot spot : parkingSpots) {
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getVehicleType());
        }
    }
}
