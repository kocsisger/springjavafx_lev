package hu.unideb.inf.lev.SpringJavaFX.frontend;

import hu.unideb.inf.lev.SpringJavaFX.SpringJavaFxApplication;
import hu.unideb.inf.lev.SpringJavaFX.SpringManager;
import hu.unideb.inf.lev.SpringJavaFX.model.PersonRepository;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFXApp extends Application {

    static Manager manager = new SpringManager();

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("JavaFX APP is running...!!!");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainWindow.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        manager.start();
        System.out.println("JavaFX -> " + manager.load());
    }

    @Override
    public void stop() throws Exception {
        manager.stop();
        super.stop();
    }
}
