public class Booking extends TravelReservation {
    private String seatNumber;
    private String classType;
   public Booking (int bookingNumber, Flight flight, Passenger passenger, String seatNumber, String classType){
        super (bookingNumber, flight, passenger);
        this.seatNumber = seatNumber;
        this.classType = classType;
   }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getClassType() {
        return classType;
    }
    public void setClassType(String classType) {
        this.classType = classType;
    }
}
