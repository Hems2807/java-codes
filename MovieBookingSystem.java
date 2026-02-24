package string;

class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

class Movie {
    private String movieName;
    private int availableSeats;

    // Constructor
    public Movie(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    // Method to book tickets
    public void bookTicket(int seats) throws SeatNotAvailableException {

        if (seats > availableSeats) {
            throw new SeatNotAvailableException(
                "Not enough seats available for " + movieName
            );
        }

        availableSeats -= seats;
        System.out.println(seats + " seat(s) booked successfully.");
        System.out.println("Remaining seats: " + availableSeats);
    }
}

// Main Class
public class MovieBookingSystem {
    public static void main(String[] args) {

        Movie m1 = new Movie("Avengers", 5);

        try {
            m1.bookTicket(3);   // Valid booking
            m1.bookTicket(4);   // Exceeds seats → Exception
        }
        catch (SeatNotAvailableException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
