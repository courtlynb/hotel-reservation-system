package api;

import model.Room;
import service.MakeAReservation;

public class ReservationResource {
    private static ReservationResource instance;
    private static final MakeAReservation reserve = MakeAReservation.getInstance();
    private ReservationResource(){}
    public static ReservationResource getInstance(){
        if (instance == null){
            instance = new ReservationResource();
        }
        return instance;
    }

    public static void createACustomer(String email, String firstName, String lastName) {
        reserve.addCustomer(email, firstName, lastName);
    }

    public static void findRooms(){
        reserve.findAvailableRooms();
    }
}
