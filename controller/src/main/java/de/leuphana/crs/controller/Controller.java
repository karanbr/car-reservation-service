package de.leuphana.crs.controller;

import de.leuphana.crs.auth.behavior.AuthenticationService;
import de.leuphana.crs.auth.behavior.AuthenticationServiceImpl;
import de.leuphana.crs.auth.structure.Credentials;
import de.leuphana.crs.auth.structure.UsernamePasswordStrategy;
import de.leuphana.crs.booking.behavior.BookingService;
import de.leuphana.crs.booking.behavior.BookingServiceImpl;
import de.leuphana.crs.customer.behavior.CustomerService;
import de.leuphana.crs.customer.behavior.CustomerServiceImpl;
import de.leuphana.crs.customer.structure.model.Customer;
import de.leuphana.crs.database.controller.Database;
import de.leuphana.crs.resource.bahavior.ResourceService;
import de.leuphana.crs.resource.bahavior.ResourceServiceImpl;

import java.util.List;

public class Controller {

    private static final Database DATABASE = new Database();
    private static final BookingService BOOKING_SERVICE = new BookingServiceImpl();
    private static final ResourceService RESOURCE_SERVICE = new ResourceServiceImpl();
    private static final CustomerService CUSTOMER_SERVICE = new CustomerServiceImpl();
    private static final AuthenticationService AUTHENTICATION_SERVICE = new AuthenticationServiceImpl();

    public static void saveCustomerToDatabase() {

    }


    public static List<Customer> getCustomersFromDatabase() {
       return DATABASE.getAllCustomers();
    }

    // TODO
    public static void loginCustomer(String username, String password) {
        UsernamePasswordStrategy strategy = new UsernamePasswordStrategy(new Credentials(username, password));
        AUTHENTICATION_SERVICE.setAuthenticator(strategy);
    }

    public static void loginAdmin() {

    }

    public static void book() {

    }

    public static void main(String[] args) {
        System.out.println(DATABASE);
    }

}
