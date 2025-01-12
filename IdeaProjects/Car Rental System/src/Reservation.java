import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;

    public Reservation(String reservationId, Customer customer, Car car, LocalDate startDate, LocalDate endDate) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice();
    }

    private double totalPrice(){
        long daysRented = ChronoUnit.DAYS.between(startDate, endDate) + 1;
        return car.getRentalPricePerDay()*daysRented;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
