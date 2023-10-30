package com.example.loginpanel;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationWindow {

    @FXML
    public PasswordField repPasswordInput;
    @FXML
    public PasswordField passwordInput;
    @FXML
    public TextField nameInput;
    @FXML
    public TextField loginInput;
    public TextField surnameInput;
    public Button regBtn;

    @FXML
    protected void registerBtn() throws IOException {
        if(passwordInput.getText().equals(repPasswordInput.getText())){
            User user = new User(passwordInput.getText(), loginInput.getText(), nameInput.getText(), surnameInput.getText());
            DataBase.users.add(user);
            Stage stage = (Stage) regBtn.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Password incorrect");
            alert.setHeaderText("Passwords don't match");
            alert.showAndWait().ifPresent(rs -> {
            });
        }
    }

}
