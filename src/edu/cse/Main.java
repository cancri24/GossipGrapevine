package edu.cse;

//edited by Alex & CJ
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.util.Random;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import sun.plugin.javascript.navig.Anchor;

public class Main extends Application {
    // static ComboBx cb;
    static private ChoiceBox cb;
    private String type = "random";
    static Random rand = new Random();
    static Text gossipText = new Text();
// Edited by alex
    private void GetGossip_Click() {
        // gets next item from Gossip
        // Subject next = Gossip();
        String newGossip = Gossip.getGossip(type);
        System.out.println(newGossip);
        gossipText.setWrappingWidth(400);
        gossipText.setText(newGossip);
        //gossipLabel.setText(newGossip);
    }

        @Override
        public void start (Stage firstStage) throws Exception {
            Button NewGossip = new Button("New Gossip");
            NewGossip.setOnAction(e -> GetGossip_Click());

            //gossipLabel = new Label();

            cb = new ChoiceBox(FXCollections.observableArrayList("Person", "Item", "Random"));
            cb.getSelectionModel().selectedIndexProperty().addListener(
                    new ChangeListener<Number>() {
                        @Override
                        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                            // choicebox selected "Person"
                            if (newValue.intValue() == 0) {
                                type = "person";
                            } else if (newValue.intValue() == 1) {
                                type = "item";
                            } else if (newValue.intValue() == 2) {
                                type = "random";
                            }


                        }
                    });

            // Borderpane created 5 regions; top, bottom, left, right, and center
            BorderPane border = new BorderPane();
            AnchorPane topAnchorPane = new AnchorPane();
            AnchorPane bottomAnchorpane = new AnchorPane();
            AnchorPane centerAnchorpane = new AnchorPane(gossipText);

            topAnchorPane.getChildren().add(cb);
            bottomAnchorpane.getChildren().add(NewGossip);
            AnchorPane.setLeftAnchor(cb, 4.20);
            AnchorPane.setLeftAnchor(NewGossip, 4.20);
            AnchorPane.setBottomAnchor(gossipText, 35.75);
            border.setTop(topAnchorPane);
            border.setBottom(bottomAnchorpane);
            border.setCenter(centerAnchorpane);


            Scene theScene = new Scene(border, 450, 150);
            firstStage.setScene(theScene);
            firstStage.setTitle("Gossip Generator");
            firstStage.show();

        }
    }
