
class Hackathon3 {
    String movieName;
    String customerName;
    double ticketPrice;
    int numberOfTickets;

    
    Hackathon3() {
        movieName = "AVATAR";
        customerName = "UNKNOWN";
        ticketPrice = 200;
        numberOfTickets = 1;
    }

    
    Hackathon3(String movie, String customer, double price, int tickets) {
        movieName = movie;
        customerName = customer;
        ticketPrice = price;
        numberOfTickets = tickets;
    }


    double calculateAmount() {
        return ticketPrice * numberOfTickets;
    }

    void bookTicket(String customer, int tickets) {
        customerName = customer;
        numberOfTickets = tickets;
        displayBooking();
    }

    void bookTicket(String movie, String customer,
                    double price, int tickets) {
        movieName = movie;
        customerName = customer;
        ticketPrice = price;
        numberOfTickets = tickets;
        displayBooking();
    }

    
    void displayBooking() {
        System.out.println("\n========== CINEMA TICKET BOOKING ==========");

        if (numberOfTickets <= 0 || ticketPrice < 0) {
            System.out.println("Invalid booking details!");
            return;
        }

        double total = calculateAmount();
        double discount = 0;

        if (numberOfTickets >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("Customer Name  : "
                + customerName.toUpperCase());
        System.out.println("Movie Name     : "
                + movieName.toUpperCase());
        System.out.printf("Ticket Price   : Rs. %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Booking Status : Booking Successful");
        System.out.printf("Total Amount   : Rs. %.2f%n", total);
        System.out.printf("Discount       : Rs. %.2f%n", discount);
        System.out.printf("Final Amount   : Rs. %.2f%n", finalAmount);
    }

    
    void compareCustomers(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("\nBoth customer names are the same.");
        } else {
            System.out.println("\nCustomer names are different.");
        }
    }

    public static void main(String[] args) {

        
        Hackathon3 booking1 =
                new Hackathon3("Avatar", "Sneha", 200, 5);

        booking1.displayBooking();

        
        Hackathon3 booking2 =
                new Hackathon3();

        
        booking2.bookTicket("Avatar", "Arjun", 200, 2);

    
        booking1.compareCustomers("Sneha", "Arjun");
    }
}
