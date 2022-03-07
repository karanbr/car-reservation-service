package de.leuphana.swa.crs.customer.behavior;

import de.leuphana.swa.crs.customer.structure.Customer;
import de.leuphana.swa.crs.customer.structure.LegalCustomerCreator;
import de.leuphana.swa.crs.customer.structure.PrivateCustomerCreator;

public class CustomerServiceImpl implements CustomerService{

    private final LegalCustomerCreator legalCustomerCreator;
    private final PrivateCustomerCreator privateCustomerCreator;

    public CustomerServiceImpl() {
        legalCustomerCreator = new LegalCustomerCreator();
        privateCustomerCreator = new PrivateCustomerCreator();
    }

    @Override
    public Customer createCustomer(String customerType, String customerId, String email, String telephone, String address,
                                   String name) {
        if (customerType.equals("Legal")) {
            return legalCustomerCreator.createCustomer(customerId, name, email, telephone, address);
        } else {
            return privateCustomerCreator.createCustomer(customerId, name, email, telephone, address);
        }
    }
}
