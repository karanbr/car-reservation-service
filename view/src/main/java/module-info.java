module view {

    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires lombok;

    requires customer;
    requires booking;
    requires resource;
    requires controller;


    opens de.leuphana.crs.view to javafx.fxml;
    exports de.leuphana.crs.view;

    opens de.leuphana.crs.view.controller to javafx.fxml;
    exports de.leuphana.crs.view.controller;
}