import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField FirstNumber;
    @FXML
    TextField SecondNumber;
    @FXML
    TextField Sum;
    @FXML
    Label ErrorField;

    @FXML
    public void click(ActionEvent Event){
        try {
            double a = Double.parseDouble(FirstNumber.getText());
            double b = Double.parseDouble(SecondNumber.getText());
            Sum.setText(String.valueOf(a+b));
        }catch (Exception e){
            ErrorField.setText("Error in Field");
        }
    }
    @FXML
    public void clickTwo(ActionEvent Event){
        try {
            FirstNumber.setText(null);
            SecondNumber.setText(null);
            Sum.setText(null);
            ErrorField.setText(null);
        }catch (Exception e){
            ErrorField.setText("Error in Field");
        }

    }


}
