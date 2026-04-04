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
        try {
            boolean found = false;

            for (Room r : rooms) {
                if (r.getRoomId() == roomId) {
                    found = true;

                    if (!r.isAvailable()) {
                        throw new Exception("Room already booked!");
                    }

                    r.bookRoom();
                    Reservation res = new Reservation(reservations.size() + 1, c, r);
                    reservations.add(res);

                    System.out.println("Room booked successfully!");
                    return;
                }
            }

            if (!found) {
                throw new Exception("Invalid Room ID!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void cancelReservation(int roomId) {
        try {
            boolean found = false;

            for (Room r : rooms) {
                if (r.getRoomId() == roomId) {
                    found = true;

                    if (r.isAvailable()) {
                        throw new Exception("Room is not booked yet!");
                    }

                    r.freeRoom();
                    System.out.println("Reservation cancelled!");
                    return;
                }
            }

            if (!found) {
                throw new Exception("Invalid Room ID!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}