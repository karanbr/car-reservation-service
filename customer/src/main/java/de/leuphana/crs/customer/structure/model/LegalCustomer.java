package de.leuphana.crs.customer.structure.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LegalCustomer extends Customer {

    private String legalName;
    private String legalForm;

    public LegalCustomer() {
    }

    public LegalCustomer(String customerId, String email, String telephone, String address,
                         String legalName) {
        super(customerId, email, telephone, address);
        this.legalForm = legalForm;
        this.legalName = legalName;
    }
}
