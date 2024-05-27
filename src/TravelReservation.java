public class TravelReservation {
    private int bookingNumber;
    private Flight flight;
    private Passenger passenger;

    public TravelReservation(int bookingNumber, Flight flight, Passenger passenger){
        this.bookingNumber =bookingNumber;
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }
    public Flight getFlight() {
        return flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }
}
