package eus.ehu.dbFormula1fx;

import eus.ehu.business_logic.BlFacade;
import eus.ehu.business_logic.BlFacadeImpl;
import eus.ehu.domain.Pilot;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class F1Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> combNationality;

    BlFacade bl = new BlFacadeImpl();

    @FXML
    private ListView<Pilot> listPilot;

    private ObservableList<String> nationalities = FXCollections.observableArrayList("All", "British", "Japanese", "Spanish", "Monegasque", "Mexican");
    private ObservableList<Pilot> pilots = FXCollections.observableArrayList();

    @FXML
    void onChange(ActionEvent event) {
        String selection = combNationality.getSelectionModel().getSelectedItem();

        if (selection.equals("All")) {
            pilots.setAll(bl.getAllPilots());
        } else {
            pilots.setAll(bl.getPilotsByNationality(selection));
        }
    }

    @FXML
    void initialize() {

        combNationality.setItems(nationalities);

        listPilot.setItems(pilots);


    }
}
