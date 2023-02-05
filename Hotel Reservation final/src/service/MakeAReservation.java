package service;

import model.Customer;
import model.Reservation;
import model.Room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MakeAReservation {
    private static MakeAReservation instance;

    private MakeAReservation() {
    }

    public static MakeAReservation getInstance() {
        if (instance == null) {
            instance = new MakeAReservation();
        }
        return instance;
    }

    private ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Reservation> reservations = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();

    public void addCustomer(String email, String firstName, String lastName) {
        customers.add(new Customer(email, firstName, lastName));
    }

    private Customer getCustomerByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                //override?
                return customer;
            }
        }
        return null;
    }

    public void addRoom(int roomNumber, Double price, String roomType, boolean isAvailable) {
        rooms.add(new Room(roomNumber, price, roomType, isAvailable));
    }

    public List<Room> findAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public boolean reserveRoom(String email, Room room) {
        if (getCustomerByEmail(email) == null) {
            System.out.println("Customer not found");
            return false;
        }
        if (room.isAvailable() && customers.contains(email)) {
            room.confirm();
            reservations.add(new Reservation(getCustomerByEmail(email), room.getRoomNumber()));
            return true;
        }
        return false;
    }

    public Collection<Reservation> getCustomersReservation(Customer customer) {
        ArrayList<Reservation> r = new ArrayList();
        for (Reservation reservation : reservations){
            Customer c = reservation.getCustomer();
            if (c.getEmail().equals(customer.getEmail())) {
                r.add(reservation);
            }
        } return r;
    }
}
