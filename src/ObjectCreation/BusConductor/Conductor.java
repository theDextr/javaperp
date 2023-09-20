package ObjectCreation.BusConductor;

public class Conductor {
    Ticket generateTicket(int fare, String destination, String passengerName) {
        Ticket t= new Ticket();
        t.depotName = "Pathankot";
        t.destination = destination;
        t.fare = fare;
        t.passengerName = passengerName;
        return t;
    }
}
