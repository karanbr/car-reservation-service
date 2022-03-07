package de.leuphana.swa.crs.customer.behavior;

import de.leuphana.swa.crs.customer.structure.Customer;

public interface CustomerService {

    Customer createCustomer(String customerType, String customerId, String email, String telephone, String address,
                            String name);
}
