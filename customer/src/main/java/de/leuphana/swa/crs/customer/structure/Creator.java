package de.leuphana.swa.crs.customer.structure;

public abstract class Creator {

    protected abstract Customer createCustomer(String customerId, String name, String email, String telephone, String address);
}
