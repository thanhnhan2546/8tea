package com.github.qquang24t5._8tea;

import com.github.qquang24t5._8tea.persistence.EmployeeDatastore;
import com.github.qquang24t5._8tea.transference.Employee;
import com.github.qquang24t5._8tea.persistence.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

/**
 * JavaFX App
 */
public class EightTeaApplication extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EightTeaApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        EmployeeDatastore.getInstance().create(new Employee()
                .setMobile("0123456789")
                .setPassword("0123456789"));

        Employee e = EmployeeDatastore.getInstance().findByPhoneNumber("0123456789");

        System.out.println(e);

        launch();

    }

}