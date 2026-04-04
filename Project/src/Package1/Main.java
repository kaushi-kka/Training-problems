package Package1;

public class Main {
    public static void main(String[] args) {

        Hotelsystem system = new Hotelsystem();

        Room r1 = new Room(101, "AC", 2000);
        Room r2 = new Room(102, "Non-AC", 1500);

        system.addRoom(r1);
        system.addRoom(r2);

        Customer c1 = new Customer("Kaushikka", "9876543210");

        system.showAvailableRooms();
        system.bookRoom(c1, 101);
    }
}