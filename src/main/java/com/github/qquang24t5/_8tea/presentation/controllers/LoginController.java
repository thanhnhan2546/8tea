package com.github.qquang24t5._8tea.presentation.controllers;

import com.github.qquang24t5._8tea.EightTeaApplication;
import com.github.qquang24t5._8tea.logic.session.LoginAction;
import com.github.qquang24t5._8tea.logic.session.SessionController;
import com.github.qquang24t5._8tea.presentation.View;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

public class LoginController {

    @FXML
    private TextField mobile;

    @FXML
    private TextField password;

    @FXML
    private Button login;

    @FXML
    private Label notification;

    @FXML
    public void onLoginBtnClicked() throws IOException, NoSuchAlgorithmException {
        LoginAction la = LoginAction.builder()
                .mobile(mobile.getText())
                .password(password.getText())
                .build();

        Set<LoginAction.Error> errors = SessionController.getInstance().login(la);

        if (errors.size() == 0) {
            notification.setStyle("-fx-background-color: GREEN;");
            notification.setText("Đăng nhập thành công");
        } else {
            notification.setStyle("-fx-background-color: PINK;");
            StringBuilder message = new StringBuilder();
            for (LoginAction.Error e : errors) {
                message.append(e.message).append("\n");
            }
            notification.setText(message.toString());
        }

    }

}
