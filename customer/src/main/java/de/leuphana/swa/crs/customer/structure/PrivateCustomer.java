package de.leuphana.swa.crs.customer.structure;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PrivateCustomer extends Customer{

    private String fullName;
    private Integer age;

    public PrivateCustomer(String customerId, String email, String telephone, String address, String fullName) {
        super(customerId, email, telephone, address);
        this.fullName = fullName;
    }
}
