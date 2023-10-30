package com.example.loginpanel;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WelcomeWindow extends Application {


    @FXML
    public Label helloText;


    @Override
    public void start(Stage stage) throws Exception {

    }
    public void initialize() {
        System.out.println(DataBase.indexUser);
        helloText.setText("Hello" + " " + DataBase.users.get(DataBase.indexUser).getName());
    }

}
