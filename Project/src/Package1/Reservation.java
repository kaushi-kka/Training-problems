package Package1;

public class Reservation {
    private int id;
    private Customer customer;
    private Room room;

    public Reservation(int id, Customer customer, Room room) {
        this.id = id;
        this.customer = customer;
        this.room = room;
    }

    public void display() {
        System.out.println("Reservation ID: " + id);
        customer.display();
        System.out.println("Room ID: " + room.getRoomId());
    }
}