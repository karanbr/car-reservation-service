package de.leuphana.crs.booking.structure;

import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Data
public class Body {

    private String bookingId;
    private String customerId;
    private String bookedCar;
    private List<String> extras;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long durationOfBooking;

    Body(String bookingId, String customerId, String bookedCar, List<String> extras, LocalDate startDate, LocalDate endDate) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.bookedCar = bookedCar;
        this.extras = extras;
        this.startDate = startDate;
        this.endDate = endDate;
        this.durationOfBooking = ChronoUnit.DAYS.between(startDate, endDate);
    }

    public static BodyBuilder builder() {
        return new BodyBuilder();
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + '\n' +
                "Customer ID: " + customerId + '\n' +
                "Booked Car: " + bookedCar + '\n' +
                "Booked Extras: " + extras + '\n' +
                "Start date: " + startDate + '\n' +
                "End date: " + endDate + '\n' +
                "Total duration: " + durationOfBooking + " days";
    }

    public static class BodyBuilder {
        private String bookingId;
        private String customerId;
        private String bookedCar;
        private List<String> extras;
        private LocalDate startDate;
        private LocalDate endDate;

        BodyBuilder() {
        }

        public BodyBuilder bookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public BodyBuilder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public BodyBuilder bookedCar(String bookedCar) {
            this.bookedCar = bookedCar;
            return this;
        }

        public BodyBuilder extras(List<String> extras) {
            this.extras = extras;
            return this;
        }

        public BodyBuilder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public BodyBuilder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Body build() {
            return new Body(bookingId, customerId, bookedCar, extras, startDate, endDate);
        }

        public String toString() {
            return "Body.BodyBuilder(bookingId=" + this.bookingId + ", customerId=" + this.customerId + ", bookedCar=" + this.bookedCar + ", extras=" + this.extras + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
        }
    }
}
