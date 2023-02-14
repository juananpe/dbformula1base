package eus.ehu.dbFormula1fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddPilotController implements FxController {

    @FXML
    private ComboBox<String> country;

    @FXML
    private TextField name;

    @FXML
    private TextField points;
    private F1Application main;

    @FXML
    void addAction(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    @Override
    public void setMain(F1Application main) {
        this.main = main;
    }
}
