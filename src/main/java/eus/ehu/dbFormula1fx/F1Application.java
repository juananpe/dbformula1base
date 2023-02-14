package eus.ehu.dbFormula1fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class F1Application extends Application {
    private Window mainWindow, addPilotWindow;

    class Window {
        Parent ui;
        FxController controller;
    }

    private Window load(String fxmlFile) throws IOException {
        Window window = new Window();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        window.ui = fxmlLoader.load();
        window.controller = fxmlLoader.getController() ;
        window.controller.setMain(this);
        return window;
    }

    private Stage stage;
    private Scene scene;


    @Override
    public void start(Stage stage) throws IOException {

        this.stage = stage;

        mainWindow = load("F1-view.fxml");
        addPilotWindow = load("addPilot.fxml");

        scene = new Scene( mainWindow.ui );
        stage.setTitle("Main");
        stage.setScene( scene );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void changeScene(String sceneName) {
        switch (sceneName) {
            case "Main":
                stage.setTitle("Main");
                scene.setRoot(mainWindow.ui);
                break;
            case "Add Pilot":
                stage.setTitle("Add Pilot");
                scene.setRoot(addPilotWindow.ui);
                break;
        }
    }
}
