package de.leuphana.crs.booking.behavior;

import de.leuphana.crs.booking.structure.Booking;
import de.leuphana.crs.customer.structure.model.Customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface BookingService {

    Booking createBooking(String bookingId, Customer customer, Map<String, List<String>> bookedResources,
                          LocalDate startDate, LocalDate endDate);
    void createDocument(Booking booking);
}
