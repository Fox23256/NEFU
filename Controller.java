import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea Area;
    @FXML
    TextField Field;
    public void UploadMessage(ActionEvent actionEvent) {
        if (!Field.getText().equals("")){
            if (Area.getText().equals("")){
             Area.setText(Field.getText());
            }else Area.setText(Area.getText()+"\n"+Field.getText());
        }
        Field.setText("");
    }
}
