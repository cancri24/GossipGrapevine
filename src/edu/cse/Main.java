package edu.cse;

//edited by Alex & CJ
import com.sun.org.apache.bcel.internal.generic.NEW;
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
import javafx.scene.control.ChoiceBox;
import sun.plugin.javascript.navig.Anchor;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;

public class Main extends Application{
   // static ComboBox cb;
    static ChoiceBox cb;
    static Random rand = new Random();


// Edited by alex
    public static void GetGossip_Click() {


    }

    @Override
    public void start(Stage firstStage) throws Exception {

        Button NewGossip = new Button ("New Gossip");
        NewGossip.setOnAction(e -> GetGossip_Click());

        cb = new ChoiceBox(FXCollections.observableArrayList("Person", "Item", "Random"));
        cb.getSelectionModel().selectedIndexProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                        // choicebox selected "Person"
                        if (newValue.intValue() == 0) {
                            // choicebox selected "Item"
                        } else if (newValue.intValue() == 1) {
                        } else if (newValue.intValue() == 2) {
                        }


                    }
                });

        // Borderpane created 5 regions; top, bottom, left, right, and center
                    BorderPane border = new BorderPane();
                    AnchorPane topAnchorPane = new AnchorPane();
                    AnchorPane bottomAnchorpane = new AnchorPane();

                    topAnchorPane.getChildren().add(cb);
                    bottomAnchorpane.getChildren().add(NewGossip);
                    AnchorPane.setLeftAnchor(cb, 4.20);
                    AnchorPane.setLeftAnchor(NewGossip, 4.20);
                    border.setTop(topAnchorPane);
                    border.setBottom(bottomAnchorpane);








                    // Alex, Creates a Combobox that lets the user choose between 3 types of pronouns
//        cb = new ComboBox(FXCollections.observableArrayList("Male", "Female", "Other"));
//        // Change method for the Choicebox selection
//        cb.getSelectionModel().selectedIndexProperty().addListener(
//                new ChangeListener<Number>() {
//                    @Override
//                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                        // pronoun he
//                        if(newValue.intValue() == 0) {
//                            //pronoun she
//                        }else if(newValue.intValue() == 1) {
//                            // pronoun other
//                        } else if(newValue.intValue() == 2) {


                    //


        Scene theScene = new Scene(border, 400, 175);
        firstStage.setScene(theScene);
        firstStage.setTitle("Gossip Generator");
        firstStage.show();

    }
    public static void main(String[] args) {Application.launch(args);}
}
