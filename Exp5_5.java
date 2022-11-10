class MovieTickets {
    static int availableSeats = 10;

    synchronized void BookTickets(int requestedSeats) {
        System.out.println("Thread entered.");
        System.out.println("Availableseats : " + availableSeats + " Requested seats : " + requestedSeats);
        if (availableSeats >= requestedSeats) {
            System.out.println("Seats are Available and Booked successfully.");
            availableSeats = availableSeats - requestedSeats;
        } else {
            System.out.println("Movie Seats are not available.");
        }
        System.out.println("Thread completed.");
        System.out.println("");
    }
}

class Person extends Thread {
    MovieTickets reserve;
    int requestedSeats;

    public Person(MovieTickets reserve, int requestedSeats) {
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
    }

    synchronized public void run() {
        reserve.BookTickets(requestedSeats);
    }
}

class Seats {
    public static void main(String[] args) {
        MovieTickets book = new MovieTickets();
        Person thread1 = new Person(book, 5);
        thread1.start();
        Person thread2 = new Person(book, 6);
        thread2.start();
        Person thread3 = new Person(book, 2);
        thread3.start();
    }
}