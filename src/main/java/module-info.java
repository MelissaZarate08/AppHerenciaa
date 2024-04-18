module com.melissazarate.demoejemplo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.melissazarate.demoejemplo to javafx.fxml;
    exports com.melissazarate.demoejemplo;
    exports com.melissazarate.demoejemplo.controllers;
    opens com.melissazarate.demoejemplo.controllers to javafx.fxml;
}