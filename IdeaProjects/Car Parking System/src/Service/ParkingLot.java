package Service;

import Entity.Level;
import Entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements ParkingLotInterface{
    private static ParkingLot instance;
    private final List<Level> levels;

    private ParkingLot() {
        levels = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    @Override
    public void addLevel(Level level) {
        levels.add(level);
    }

    @Override
    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked successfully.");
                return true;
            }
        }
        System.out.println("Could not park vehicle.");
        return false;
    }

    @Override
    public void displayAvailability() {
        for (Level level : levels) {
            level.displayAvailability();
        }
    }

    @Override
    public boolean unparkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.unparkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }
}