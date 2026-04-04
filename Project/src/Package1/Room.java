package Package1;

public class Room {
    private int roomId;
    private String type;
    private double price;
    private boolean isAvailable;

    public Room(int roomId, String type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void freeRoom() {
        isAvailable = true;
    }

    public int getRoomId() {
        return roomId;
    }
}