package de.leuphana.swa.crs.customer.structure;

public class PrivateCustomerCreator extends Creator{

    @Override
    public PrivateCustomer createCustomer(String customerId, String fullName, String email, String telephone, String address) {
        PrivateCustomer customer = new PrivateCustomer(customerId, email, telephone, address, fullName);
        System.out.println("Private Customer with ID: " + customerId + " successfully created");
        return customer;
    }
}
