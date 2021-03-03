import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FxmlForLab17_ex2 {
    @FXML
    Label label;

    public void clickButton1(ActionEvent actionEvent) {
        label.setText("You clicked Button1");
    }

    public void clickButton2(ActionEvent actionEvent) {
        label.setText("You clicked Button2");
    }

    public void clickButton3(ActionEvent actionEvent) {
        label.setText("You clicked Button3");
    }
}
