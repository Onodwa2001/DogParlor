package za.ac.cput.dogparlor.domain;

import java.util.List;
public class Booking {
    private final int bookingID;

    private final Date date;
    private final String time;
    private final String service;

    private final int total;

    private Booking (BookingBuilder builder){
        this.bookingID = builder.bookingID;
        this.date = builder.date;
        this.time = builder.time;
        this.service = builder.service;
        this.total = builder.total;
    }
    public int getBookingID (){
        return bookingID;
    }
    public int getDate (){
        return date;
    }
    public int getTime (){
        return time;
    }
    public List<String>getServices(){
        return service;
    }
    public int getTotal (){
        return total;
    }
    public static class
    BookingBuilder {
        private int bookingID;
        private int date;
        private int time;
        private List<String> service;
        private int total;

        public BookingBuilder
        setBookingID(int bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public BookingBuilder
        setDate(int date) {
            this.date = date;
            return this;
        }

        public BookingBuilder
        setTime(int time) {
            this.time = time;
            return this;
        }

        public BookingBuilder

        setServices (String services)
        {
            this.service = service;
            return this;
        }

        public BookingBuilder
        setTotal(int total) {
            this.total = total;
            return this;
        }

        public Booking buiLd() {
            return new Booking(this);
        }

        public Booking build() {
            return null;
        }
    }
    }





