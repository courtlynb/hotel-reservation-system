package model;

public class Reservation {
    private Customer customer;
    private int roomNumber;
    private boolean isReserved;

    public Reservation(Customer customer, int roomNumber){
        this.customer = customer;
        this.roomNumber = roomNumber;
        this.isReserved = true;
    }

    public Customer getCustomer(){
        return customer;
    }

    public int getRoomNumber(){
        return roomNumber;
    }
    public boolean isReserved(){
        return isReserved();
    }


    @Override
    public String toString() {
        return "Customer: " + customer + "Room: " + roomNumber;
    }
}
