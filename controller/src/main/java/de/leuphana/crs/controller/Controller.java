package de.leuphana.crs.controller;

import de.leuphana.crs.customer.structure.model.Customer;
import de.leuphana.crs.database.controller.Database;

import java.util.List;

public class Controller {

    private static final Database DATABASE = new Database();

    public static void saveCustomerToDatabase() {

    }

    public static List<Customer> getCustomersFromDatabase() {
       return null;
    }

    public static void loginCustomer() {

    }

    public static void loginAdmin() {

    }

    public static void book() {

    }

    public static void main(String[] args) {
        System.out.println(DATABASE);
    }

}
