/* BookingTest.java
  Domain test case for Booking entity
  Author: Uthimna Sisipho Rubushe (221044329)
  Date:08 April 2023
 */

package za.ac.cput.dogparlor.domain;

import org.junit.jupiter.api.Test;

import java.sql.Time;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    @Test
    void testObjectIdentity() {

        Booking booking = new Booking.BookingBuilder()
                .setBookingID(251)
                .setDate(new Date())
                .setTime(new Time(new Date().getTime()).toString())
                .setService("Wash , Groom and Dip")
                .setTotal(2500)
                .build();

        Booking booking2 = booking;

        assertSame(booking2, booking);
    }

    @Test
    void testObjectEquality() {
        Booking booking = new Booking.BookingBuilder()
                .setBookingID(251)
                .setDate(new Date())
                .setTime(new Time(new Date().getTime()).toString())
                .setService("Wash , Groom and Dip")
                .setTotal(250)
                .build();

        Booking booking2 = new Booking.BookingBuilder()
                .setBookingID(251)
                .setDate(new Date())
                .setTime(new Time(new Date().getTime()).toString())
                .setService("Wash,Groom and Dip")
                .setTotal(250)
                .build();

        assertEquals(booking, booking2);
    }
}