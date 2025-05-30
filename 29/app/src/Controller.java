import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
// import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller implements Initializable{
    
    private ObservableList<Siswa> daftarSiswa;
    @FXML
    private ComboBox<Siswa> cb;
    @FXML
    private TableColumn<Siswa, String> kolom1;
    @FXML
    private ListView<Siswa> list;
    @FXML
    private Button ok;
    @FXML
    private TableView<Siswa> tbl;
    @FXML
    void actionOK(ActionEvent event) {
        daftarSiswa.add( new Siswa("Siswa Baru"));
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        daftarSiswa = FXCollections.observableArrayList(
            new Siswa("nana"),
            new Siswa("nini"),
            new Siswa("nunu")
        );
        list.setItems(daftarSiswa);
        cb.setItems(daftarSiswa);
        cb.getSelectionModel().select(0);
        tbl.setItems(daftarSiswa);
        kolom1.setCellValueFactory(data -> 
        new SimpleStringProperty(data.getValue().getNama())
        );
        // daftarSiswa.addListener((ListChangeListener<? super Siswa>) arg0);
    }

}
