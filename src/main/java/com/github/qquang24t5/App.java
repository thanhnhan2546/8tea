package com.github.qquang24t5;

import com.github.qquang24t5.dtos.Employee;
import com.github.qquang24t5.models.Database;
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
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        // Đoạn code dưới là để thử xem liệu Hibernate đã được tích hợp thành công hay chưa

        Employee exampleEmployee = new Employee()
                .setPhoneNumber("0123456789")
                .setPassword("This1sAVery5trongPasword!")
                .setPasswordHashed(false)
                .setFirstName("Quang")
                .setLastName("Pham")
                .setMale(true);

        Database db = Database.getInstance();
        Session session = db.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        session.save(exampleEmployee);
        transaction.commit();

        transaction = session.beginTransaction();
        var employees = session.createQuery("FROM Employee").list();
        for (Object o : employees) {
            Employee employee = (Employee) o;
            System.out.println(employee);
        }
        transaction.commit();

        session.close();

        // Kết thúc phần code thử Hibernate

        launch();

    }

}