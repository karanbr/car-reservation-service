module database {
    requires lombok;
    requires customer;
    requires resource;
    requires booking;

    exports de.leuphana.crs.database.controller;
}