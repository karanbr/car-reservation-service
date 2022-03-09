package de.leuphana.crs.booking.structure;

import de.leuphana.crs.customer.structure.model.Customer;
import de.leuphana.crs.customer.structure.model.LegalCustomer;
import de.leuphana.crs.customer.structure.model.PrivateCustomer;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

@Data
public class Booking {

    private String bookingID;
//    private PrivateCustomer privateCustomer;
//    private LegalCustomer legalCustomer;
    private Customer customer;
    private Map<String, List<String>> bookedResources; // key: carId , value: addOns
    private LocalDate startDate;
    private LocalDate endDate;
    private Head head;
    private Body body;
    private Footer footer;

//    Booking(String bookingID, PrivateCustomer privateCustomer, LegalCustomer legalCustomer, Map<String, List<String>> bookedResources, LocalDate startDate, LocalDate endDate) {
//        this.bookingID = bookingID;
//        this.privateCustomer = privateCustomer;
//        this.legalCustomer = legalCustomer;
//        this.bookedResources = bookedResources;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        if (legalCustomer == null) {
//            this.head = Head.builder()
//                    .name(privateCustomer.getFullName())
//                    .address(privateCustomer.getAddress())
//                    .email(privateCustomer.getEmail())
//                    .build();
//            this.body = Body.builder()
//                    .bookingId(bookingID)
//                    .customerId(privateCustomer.getCustomerId())
//                    .bookedCar("TODO")
//                    .startDate(startDate)
//                    .endDate(endDate)
//                    .extras(null) // TODO
//                    .build();
//        } else if (privateCustomer == null) {
//            this.head = Head.builder()
//                    .name(legalCustomer.getLegalName())
//                    .address(legalCustomer.getAddress())
//                    .email(legalCustomer.getEmail())
//                    .build();
//            this.body = Body.builder()
//                    .bookingId(bookingID)
//                    .customerId(legalCustomer.getCustomerId())
//                    .bookedCar("TODO")
//                    .startDate(startDate)
//                    .endDate(endDate)
//                    .extras(null) // TODO
//                    .build();
//        } else {
//            throw new IllegalArgumentException("Private Customer OR Legal Customer has to be null");
//        }
//        this.footer = Footer.builder().build();
//    }
Booking(String bookingID, Customer customer, Map<String, List<String>> bookedResources, LocalDate startDate, LocalDate endDate) {
    this.bookingID = bookingID;
    this.customer = customer;
    this.bookedResources = bookedResources;
    this.startDate = startDate;
    this.endDate = endDate;
    if (customer instanceof PrivateCustomer) {
        this.head = Head.builder()
                .name(((PrivateCustomer) customer).getFullName())
                .address(customer.getAddress())
                .email(customer.getEmail())
                .build();
    } else if (customer instanceof LegalCustomer) {
        this.head = Head.builder()
                .name(((LegalCustomer) customer).getLegalName())
                .address(customer.getAddress())
                .email(customer.getEmail())
                .build();

    }
    this.body = Body.builder()
            .bookingId(bookingID)
            .customerId(customer.getCustomerId())
            .bookedCar("TODO")
            .startDate(startDate)
            .endDate(endDate)
            .extras(null) // TODO
            .build();
    this.footer = Footer.builder().build();
}

    public static BookingBuilder builder() {
        return new BookingBuilder();
    }

//    PDDocument document;
//    PDPage page;

    public Period getDurationPeriod() {
        return Period.between(startDate, endDate);
    }

    public Long getDurationDays() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    @Override
    public String toString() {
        return head.toString() + "\n" +
                body.toString() + "\n" +
                footer.toString();
    }

    public static class BookingBuilder {
        private String bookingID;
        private Customer customer;
        private Map<String, List<String>> bookedResources;
        private LocalDate startDate;
        private LocalDate endDate;

        BookingBuilder() {
        }

        public BookingBuilder bookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public BookingBuilder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public BookingBuilder bookedResources(Map<String, List<String>> bookedResources) {
            this.bookedResources = bookedResources;
            return this;
        }

        public BookingBuilder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public BookingBuilder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Booking build() {
            return new Booking(bookingID, customer, bookedResources, startDate, endDate);
        }
    }
}
