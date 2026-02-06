import java.util.Vector;

public class TrainWaitingList {

    public static void main(String[] args) {

        Vector<String> waitingList = new Vector<>();

        // Passengers added
        waitingList.add("Passenger A");
        waitingList.add("Passenger B");
        waitingList.add("Passenger C");

        System.out.println("Waiting List:");
        System.out.println(waitingList);

        // Ticket confirmed (FIFO)
        String confirmed = waitingList.remove(0);
        System.out.println("\nTicket Confirmed for: " + confirmed);

        System.out.println("Updated Waiting List:");
        System.out.println(waitingList);
    }
}