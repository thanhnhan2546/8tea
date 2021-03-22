package com.github.qquang24t5._8tea.presentation.controllers;

import com.github.qquang24t5._8tea.EightTeaApplication;
import com.github.qquang24t5._8tea.presentation.View;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField mobileTfd;

    @FXML
    private TextField passwordPwf;

    @FXML
    private Button loginBtn;

    @FXML
    public void onLoginBtnClicked() throws IOException {
        System.out.println("Hello World");
        EightTeaApplication.setRoot(View.STARTUP.fxml);
    }

}
