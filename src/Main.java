import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Flight flight1 = new Flight("A202", "Istanbul", "Tehran", 2000, 300);
        Flight flight2 = new Flight("B542", "Istanbul", "London", 3000, 400);
        Flight flight3 = new Flight("L567", "Paris", "Tehran", 5000, 520);
        Flight flight4 = new Flight("S492", "Istanbul", "Izmir", 800, 80);
        Flight flight5 = new Flight("I412", "Florence", "Berlin", 6000, 500);
        Flight flight6 = new Flight("M712", "Tehran", "New York", 9000, 100);


        Passenger passenger1 = new Passenger("Mina", "Mina@gmail.com");
        Passenger passenger2 = new Passenger("Rayan", "Rayan@gmail.com");
        Passenger passenger3 = new Passenger("Ana", "Ana@gmail.com");

        FlightBookingSystem fbs = new FlightBookingSystem();
        fbs.addFlight(flight1);
        fbs.addFlight(flight2);
        fbs.addFlight(flight3);
        fbs.addFlight(flight4);
        fbs.addFlight(flight5);
        fbs.addFlight(flight6);
        fbs.displayFlights();

        //Scenario 2 Search for a Flight
        //getting input form user
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Search for a flight: \nEnter the origin city: ");
        String origin = scanner1.nextLine();
        System.out.print("Enter the destination city: ");
        String destination = scanner1.nextLine();

        // Search for the flight
        Flight selectedFlight = fbs.searchFlight(origin, destination);
        if (selectedFlight != null) {
            System.out.println("------------------\nFlight found:");
            System.out.println("Flight Number: " + selectedFlight.getFlightNumber());
            System.out.println("Origin: " + selectedFlight.getOrigin());
            System.out.println("Destination: " + selectedFlight.getDestination());
            System.out.println("Fare: " + selectedFlight.getFare() + "\n------------------");
        } else {
            System.out.println("No flights found.");
        }

        //Scenario 3 Book a Flight
        // getting input form user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the flight Number: ");
        String flightNumber = scanner.nextLine();

        // Check if the flight number exists
        Flight selectedFlight1 = fbs.searchFlight(flightNumber);
        if (selectedFlight1 != null) {
            System.out.print("Select the class:\n1. Business class\n2. Domestic class\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    fbs.bookBusinessClass(name, email, flightNumber);
                    break;
                case 2:
                    fbs.bookDomesticClass(name, email, flightNumber);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } else{
            System.out.println("Invalid flight number.");
            }
    }
}