package edu.cse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage firstStage) throws Exception {
        Button test = new Button("test");
        Scene theScene = new Scene(test, 200, 200);
        firstStage.setScene(theScene);
        firstStage.show();
    }
}
