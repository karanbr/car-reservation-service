module view {

    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires lombok;

    opens de.leuphana.swa.crs.view to javafx.fxml;
    exports de.leuphana.swa.crs.view;

    opens de.leuphana.swa.crs.controller to javafx.fxml;
    exports de.leuphana.swa.crs.controller;
}