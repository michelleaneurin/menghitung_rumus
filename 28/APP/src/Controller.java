import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// import javafx.scene.control.Alert.AlertType;

public class Controller {

    @FXML
    private Button btnSend;

    @FXML
    private TextField tfNama;

    @FXML
    void actionSend(ActionEvent event) {
        String namaok = tfNama.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("popup");
            alert.setHeaderText("text :");
            alert.setContentText(namaok);
            alert.showAndWait();

    }

}


