package edu.cse;

//edited by Alex & CJ
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
import javafx.scene.layout.BorderPane;
import java.util.Random;

public class Main extends Application{
    static ComboBox cb;
    static Random rand = new Random();

    @Override
    public void start(Stage firstStage) throws Exception {

        // Alex, Creates a Combobox that lets the user choose between 3 types of pronouns
        ComboBox cb = new ComboBox(FXCollections.observableArrayList("Male", "Female", "Other"));
        // Change method for the Choicebox selection
        cb.getSelectionModel().selectedIndexProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                        if(newValue.intValue() == 0) {
                            // Pronoun he selected
                        }else if(newValue.intValue() == 1) {

                        }else if(newValue.intValue() == 2) {

                        }
                    }
                });
        Scene theScene = new Scene(cb, 200, 200);
        firstStage.setScene(theScene);
        firstStage.show();

    }
}
