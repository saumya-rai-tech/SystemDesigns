package Entity;

public abstract class Vehicle {
    public String licencePlate;
    public VehicleType vehicleType;

    public Vehicle(String licencePlate, VehicleType vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
