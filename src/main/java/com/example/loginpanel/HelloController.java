package com.example.loginpanel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    //public DataBase db = new DataBase();
    @FXML
    public TextField loginInput;
    @FXML
    public PasswordField passwordInput;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        if(DataBase.checkPassword(loginInput.getText(), passwordInput.getText())){
            System.out.println("yes");
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HelloWindo.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 400);
            Stage stage = new Stage();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();

        } else {
            for(int i = 0; i < DataBase.users.size(); i++){
                System.out.println(DataBase.users.get(i).getLogin() + " " + DataBase.users.get(i).getPassword() );
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Password incorrect");
            alert.setHeaderText("Password incorrect");
            alert.showAndWait().ifPresent(rs -> {
            });
        }
    }

    @FXML
    protected void registerBtn() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegistrationPanel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}