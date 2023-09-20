package ObjectCreation.BusConductor;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Person p = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of the Passenger: ");
        String passengerName = scan.nextLine();
        System.out.println("Please enter your Destination Name: ");
        String destination = scan.nextLine();
        p.travel(passengerName, 450, destination);
    }
}
