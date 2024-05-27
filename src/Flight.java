public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private double fare;
    private int totalSeats;

    public Flight(String flightNumber, String origin, String destination, double fare, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
        this.totalSeats = totalSeats;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getOrigin() {
        return origin;
    }
    public double getFare() {
        return fare;
    }
    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String toString (){
        return "FlightNumber: " + flightNumber +
        "Origin: " + origin +
        "Destination: " + destination +
        "Fare:  " +  fare +
        "TotalSeats: " +  totalSeats;

    }
}
