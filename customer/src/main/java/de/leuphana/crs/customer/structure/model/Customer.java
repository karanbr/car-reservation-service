package de.leuphana.crs.customer.structure.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public abstract class Customer {

    private String customerId;
    private String email;
    private String telephone;
    private String address;
    private List<String> bookings;

    public Customer(String customerId, String email, String telephone, String address) {
        this.customerId = customerId;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }
}
