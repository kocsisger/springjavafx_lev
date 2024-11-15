package hu.unideb.inf.lev.SpringJavaFX.frontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindowController {
    @FXML
    public Label personLabel;

    @FXML
    public void loadData(ActionEvent actionEvent) {
        personLabel.setText(JavaFXApp.manager.load().toString());
    }
}
