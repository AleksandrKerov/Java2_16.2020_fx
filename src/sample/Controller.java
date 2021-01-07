package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    @FXML
    public void clickClose(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void enterText(ActionEvent event) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    @FXML
    public void clearTextArea(ActionEvent event) {
        textArea.clear();
    }
}
