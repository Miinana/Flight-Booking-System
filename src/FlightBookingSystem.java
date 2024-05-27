
import java.util.ArrayList;
import java.util.Random;

public class FlightBookingSystem {
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;
    private ArrayList<String> availableSeats;

    public FlightBookingSystem() {
        this.flights = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.availableSeats = new ArrayList<>();
    }
    //Method to add flight objects in the arraylist of this class
    public void addFlight(Flight flight){
        flights.add(flight);
        for (int i = 1 ; i <= flight.getTotalSeats(); i++){
            availableSeats.add(Integer.toString(i));
        }
    }
    //Method to add Booking objects, It will use in Scenario 3
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    // select Seat Number method will generate a random seat number
    public String selectSeatNumber() {
        if (availableSeats.isEmpty()) {
            System.out.println("No available seats.");
            return null;
        } else {
            Random random = new Random();
            int index = random.nextInt(availableSeats.size());
            char letter = (char) (random.nextInt(26) + 'A'); // random letter
            int number = random.nextInt(89); // random number

            String seatNumber = Character.toString(letter) + number; // Combine the letter and number

            availableSeats.remove(index); // Remove the selected seat from the available seats list
            return seatNumber;
        }
    }
    //will generate a random Booking number
    private int createBookingNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }
    public void displayFlights() {
        System.out.println("Available Flights ");
        for (Flight flight : flights) {
            System.out.println("Flight Number: " + flight.getFlightNumber());
            System.out.println("Origin: " + flight.getOrigin());
            System.out.println("Destination: " + flight.getDestination());
            System.out.println("Fare: " + flight.getFare());
            System.out.println("-----------------");
        }
    }

    private void displayBookingDetails(Booking booking) {
        System.out.println("----------------\nBooking successful. ");
        System.out.println("Booking Number: " + booking.getBookingNumber());
        System.out.println("Flight: " + booking.getFlight().getFlightNumber());
        System.out.println("Passenger: " + booking.getPassenger().getName());
        System.out.println("Seat Number: " + booking.getSeatNumber());
        System.out.println("Class Type: " + booking.getClassType());
        System.out.println("---------------");
    }
    // search method with two arguments
    public Flight searchFlight(String origin, String destination) {
        for (Flight flight : flights) {
            if (flight.getDestination().equals(destination) && flight.getOrigin().equals(origin)) {
                return flight;
            }
        }
        return null;
    }
    // search method with a argument
    public Flight searchFlight(String inputFlightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(inputFlightNumber)) {
                return flight;
            }
        }
        return null; // Flight not found
    }
    public void bookBusinessClass(String passengerName, String email , String flightNumber ){
        Flight flight = searchFlight(flightNumber);
        if (flight != null){
            Passenger passenger = new Passenger(passengerName, email);
            String seatNumber = selectSeatNumber();
            if (seatNumber != null) {
                Booking booking = new Booking(createBookingNumber(), flight, passenger, seatNumber, "Business Class");
                addBooking(booking);
                displayBookingDetails(booking);
            }
        } else {
            System.out.println("Invalid flight number.");
        }
    }

    public void bookDomesticClass(String passengerName, String email ,String flightNumber) {
        Flight flight = searchFlight(flightNumber);
        if (flight != null) {
            Passenger passenger = new Passenger(passengerName, email);
            String seatNumber = selectSeatNumber();
            if (seatNumber != null) {
                Booking booking = new Booking(createBookingNumber(), flight, passenger, seatNumber, "Domestic Class");
                addBooking(booking);
                displayBookingDetails(booking);
            }
        } else {
            System.out.println("Invalid flight number.");
        }
    }
}

