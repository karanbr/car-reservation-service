package de.leuphana.crs.customer.behavior;

import de.leuphana.crs.customer.structure.model.Customer;

public interface CustomerService {

    Customer createCustomer(String customerType, String customerId, String email, String telephone, String address,
                            String name);

}
