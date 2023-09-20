package ObjectCreation.BusConductor;

public class Person {
    void travel(String passengerName,int fare ,String destinationName) {
        Conductor c = new Conductor();
        Ticket t = c.generateTicket(fare, destinationName, passengerName);
        System.out.println("Depot Name: "+t.depotName);
        System.out.println("Passenger Name: "+t.passengerName);
        System.out.println("Destination: "+t.destination);
        System.out.println("fare: "+t.fare);
    }

}
