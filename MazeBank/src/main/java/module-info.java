module com.luvienze.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.luvienze.mazebank to javafx.fxml;
    exports com.luvienze.mazebank;
    exports com.luvienze.mazebank.Controllers;
    exports com.luvienze.mazebank.Controllers.Admin;
    exports com.luvienze.mazebank.Controllers.Client;
    exports com.luvienze.mazebank.Models;
    exports com.luvienze.mazebank.Views;
}