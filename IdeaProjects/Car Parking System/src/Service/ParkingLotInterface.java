package Service;

import Entity.Level;
import Entity.Vehicle;

public interface ParkingLotInterface {
    public void addLevel(Level level);
    public boolean parkVehicle(Vehicle vehicle);
    public void displayAvailability();
    public boolean unparkVehicle(Vehicle vehicle);
}
