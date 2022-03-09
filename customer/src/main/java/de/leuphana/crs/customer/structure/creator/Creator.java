package de.leuphana.crs.customer.structure.creator;

import de.leuphana.crs.customer.structure.model.Customer;

public abstract class Creator {

    protected abstract Customer createCustomer(String customerId, String name, String email, String telephone, String address);
}
