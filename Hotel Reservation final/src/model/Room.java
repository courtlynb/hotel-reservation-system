package model;

public class Room {
    private int roomNumber;
    private Double price;
    String roomType;
    private boolean isAvailable;


    public Room(int roomNumber, Double price, String roomType, boolean isAvailable){
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
        this.isAvailable = true;
        //this.isReserved = false;
    }

    public int getRoomNumber(){
        return roomNumber;
    }
    public Double getPrice(){
        return price;
    }
    public String getRoomType(){
        return roomType;
    }

    public boolean isAvailable(){
        return isAvailable;
    }


    public void confirm(){
        isAvailable = false;
    }


    @Override
    public String toString() {
        return "Room Number: " + roomNumber + "\n" +
                "Price: " + price + "\n" +
                "Is this room available? " + isAvailable;
    }
}
