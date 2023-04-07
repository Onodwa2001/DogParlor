package za.ac.cput.dogparlor.repository;

import za.ac.cput.dogparlor.domain.BookingPayment;


import java.util.HashSet;
import java.util.Set;

public class BookingPaymentRepository {
    private static BookingPaymentRepository repository = null;
    private Set<BookingPayment> BookingPaymentDB = null;



    public BookingPaymentRepository(){
        BookingPaymentDB = new HashSet<BookingPayment>();
    }
    public static BookingPaymentRepository getRepository(){
        if (repository == null){
            repository = new BookingPaymentRepository();
        }
        return repository;
    }
    public void create (int bookingID, int paymentID){

    }
    public void read(){

    }
    public void update(){

    }
    public boolean delete (int paymentID){
        boolean success = true;

        return success;
    }
}


