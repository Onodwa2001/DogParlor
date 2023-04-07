package za.ac.cput.dogparlor.repository;


import za.ac.cput.dogparlor.domain.Payment;


import java.util.HashSet;
import java.util.Set;

public class PaymentRepository {

    private static PaymentRepository repository = null;
    private Set<Payment> paymentDB = null;



    public PaymentRepository(){
        paymentDB = new HashSet<Payment>();
    }
    public static PaymentRepository getRepository(){
        if (repository == null){
            repository = new PaymentRepository();
        }
        return repository;
    }
    public void create (String paymentID ,Double amount){

    }
    public void read(){

    }
    public void update(){

    }
    public boolean delete (Double amount){
        boolean success = true;

        return success;
    }
}
