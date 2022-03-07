package de.leuphana.swa.crs.customer.structure;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
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
