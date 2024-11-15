package hu.unideb.inf.lev.SpringJavaFX.frontend;

import hu.unideb.inf.lev.SpringJavaFX.SpringJavaFxApplication;
import hu.unideb.inf.lev.SpringJavaFX.model.PersonRepository;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class JavaFXApp extends Application {
    ConfigurableApplicationContext ctx;
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("JavaFX APP is running...!!!");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainWindow.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        ctx = SpringApplication.run(SpringJavaFxApplication.class);
        PersonRepository personRepo = (PersonRepository) ctx.getBean(PersonRepository.class);
        System.out.println("JavaFX -> " + personRepo.findByName("Ödön"));
    }

    @Override
    public void stop() throws Exception {
        ctx.close();
        super.stop();
    }
}
