package eus.ehu.dbFormula1fx;

import eus.ehu.business_logic.BlFacade;
import eus.ehu.business_logic.BlFacadeImpl;
import eus.ehu.domain.Pilot;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;


public class F1Controller {

    @FXML
    private ComboBox<String> combNationality;

    BlFacade bl = new BlFacadeImpl();

    @FXML
    private ListView<Pilot> listPilot;

    final private ObservableList<String> nationalities = FXCollections.observableArrayList("All", "United Kingdom", "Japan", "Spain", "Monaco", "Mexico");
    final private ObservableList<Pilot> pilots = FXCollections.observableArrayList();

    @FXML
    void onChange() {
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
