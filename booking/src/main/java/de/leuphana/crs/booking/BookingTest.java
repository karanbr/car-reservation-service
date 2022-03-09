package de.leuphana.crs.booking;

import de.leuphana.crs.booking.behavior.BookingService;
import de.leuphana.crs.booking.behavior.BookingServiceImpl;
import de.leuphana.crs.booking.structure.Body;
import de.leuphana.crs.booking.structure.Booking;
import de.leuphana.crs.booking.structure.Head;
import de.leuphana.crs.customer.structure.model.PrivateCustomer;

import java.time.LocalDate;
import java.util.List;

public class BookingTest {



    public static void main(String[] args) {
//        System.out.println(new Head("Peter", "Hamburg", "peter@gmail.com").toString());
//        System.out.println("-----------------------");
//        System.out.println(Body
//                .builder()
//                .bookingId("1234")
//                .customerId("7777")
//                .bookedCar("Audi A4")
//                .extras(List.of("Child Seat", "Automatic"))
//                .startDate(LocalDate.now())
//                .endDate(LocalDate.now())
//                .build());

        PrivateCustomer privateCustomer = new PrivateCustomer("123", "hans@gmail.com", "023487519", "Hamburg", "Hans Peter");

        Booking booking = Booking
                .builder()
                .bookingID("88888")
                .customer(privateCustomer)
                .bookedResources(null)
                .startDate(LocalDate.now())
                .endDate(LocalDate.now())
                .build();

        System.out.println(booking.toString());

        BookingService bookingService = new BookingServiceImpl();
        bookingService.createDocument(booking);
    }
}
