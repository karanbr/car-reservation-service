module controller {
    requires database;
    requires customer;
    requires booking;
    requires resource;
    requires authentication;

    exports de.leuphana.crs.controller;
}