/* Payment.java
   Entity for the Address
   Author: Uthimna Sisipho Rubushe (221044329)
   Date:05 April 2023
 */
package za.ac.cput.dogparlor.domain;

import java.util.Date;
import java.util.Objects;

public class Booking {
    private int bookingID;
    private Date date;
    private String time;
    private String service;
    private float total;

    private Booking() {}

    private Booking(BookingBuilder builder){
        this.bookingID = builder.bookingID;
        this.date = builder.date;
        this.time = builder.time;
        this.service = builder.service;
        this.total = builder.total;
    }


    public int getBookingID (){
        return bookingID;
    }
    public Date getDate (){
        return date;
    }
    public String getTime (){
        return time;
    }
    public String getService(){
        return service;
    }
    public float getTotal (){
        return total;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking that = (Booking) o;
        return bookingID == that.bookingID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingID);
    }

    public static class BookingBuilder {
        private int bookingID;
        private Date date;
        private String time;
        private String service;
        private float total;

        public BookingBuilder() {}

        public BookingBuilder setBookingID(int bookingID){
            this.bookingID = bookingID ;
            return this;
        }
        public BookingBuilder setDate (Date date){
            this.date = date;
            return this;
        }
        public BookingBuilder setTime (String time){
            this.time = time;
            return this;
        }
        public BookingBuilder setService (String service){
            this.service = service;
            return this;
        }
        public BookingBuilder setTotal (float total){
            this.total = total;
            return this;
        }
        public Booking build(){
            return new Booking(this);
        }
    }

}

