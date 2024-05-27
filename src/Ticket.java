public class Ticket extends TravelReservation {
    private double price;
    private String ticketType;
    public Ticket (int bookingNumber, Flight flight, Passenger passenger, double price, String ticketType) {
        super(bookingNumber, flight, passenger);
        this.price = price;
        this.ticketType = ticketType;
    }
    public double getPrice(){
        return price;
    }
    public String getTicketType() {
        return ticketType;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
