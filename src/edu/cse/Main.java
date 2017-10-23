package edu.cse;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane

public class Main extends Application{
    static ComboBox cb;

    @Override
    public void start(Stage firstStage) throws Exception {
        Button test = new Button("test");
        Scene theScene = new Scene(test, 200, 200);
        firstStage.setScene(theScene);
        firstStage.show();

        // Alex, Creates a Combobox that lets the user choost between 3 types of pronouns
        cb = new ComboBox(FXCollections.observableArrayList("He", "She", "Other"));
        // Change method for the Choicebox selection
        cb.getSelectionModel().selectedIndexProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                        if (new_value.intValue() == 0) {
                            // Pronoun he selected
                        }else if (new_value.intValue() == 1) {

                        }else if (new_value.intValue() == 2) {

                        }
                    }
                }

    }
}
