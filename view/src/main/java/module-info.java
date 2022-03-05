module view {

    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    opens de.leuphana.swa.crs.view to javafx.fxml;
    exports de.leuphana.swa.crs.view;

}