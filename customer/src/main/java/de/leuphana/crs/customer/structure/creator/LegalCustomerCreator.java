package de.leuphana.crs.customer.structure.creator;

import de.leuphana.crs.customer.structure.model.LegalCustomer;

public class LegalCustomerCreator extends Creator {

    @Override
    public LegalCustomer createCustomer(String customerId, String legalName, String email, String telephone, String address) {
        LegalCustomer legalCustomer = new LegalCustomer(customerId, email, telephone, address, legalName);
        System.out.println("Legal Customer with ID: " + customerId + " successfully created");
        return legalCustomer;
    }
}
