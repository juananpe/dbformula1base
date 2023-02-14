module eus.ehu.dbformula1fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens eus.ehu.dbFormula1fx to javafx.fxml;
    exports eus.ehu.dbFormula1fx;
}
