package Package1;

import java.util.ArrayList;

public class Hotelsystem {
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void showAvailableRooms() {
        for (Room r : rooms) {
            if (r.isAvailable()) {
                System.out.println("Room " + r.getRoomId() + " is available");
            }
        }
    }

    public void bookRoom(Customer c, int roomId) {
        for (Room r : rooms) {
            if (r.getRoomId() == roomId && r.isAvailable()) {
                r.bookRoom();
                Reservation res = new Reservation(reservations.size() + 1, c, r);
                reservations.add(res);
                System.out.println("Room booked successfully!");
                return;
            }
        }
        System.out.println("Room not available!");
    }
}