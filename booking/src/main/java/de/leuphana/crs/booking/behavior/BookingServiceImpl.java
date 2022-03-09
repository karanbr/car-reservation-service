package de.leuphana.crs.booking.behavior;

import de.leuphana.crs.booking.structure.Booking;
import de.leuphana.crs.customer.structure.model.Customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class BookingServiceImpl implements BookingService {

    @Override
    public Booking createBooking(String bookingId, Customer customer, Map<String, List<String>> bookedResources,
                                 LocalDate startDate, LocalDate endDate) {

        return Booking
                .builder()
                .customer(customer)
                .bookedResources(null)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }

    @Override
    public void createDocument(Booking booking) {
        BookingPdf.createPdf(booking);
    }
}
