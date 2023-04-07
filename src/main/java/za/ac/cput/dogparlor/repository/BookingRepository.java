package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.Booking;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BookingRepository {
    private static BookingRepository repository = null;
    private Set<Booking> bookingDB = null;



    public BookingRepository(){
        bookingDB = new HashSet<Booking>();
    }
    public static BookingRepository getRepository(){
        if (repository == null){
            repository = new BookingRepository();
        }
        return repository;
    }
    public void create (int bookingID, Date date,String time,String service,int total){

    }
    public void read(){

    }
    public void update(){

    }
    public boolean delete (int total){
        boolean success = true;

        return success;
    }
}

