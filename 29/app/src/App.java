import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage PrimaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        PrimaryStage.setScene(new Scene(root, 700,500));
        PrimaryStage.show();
    }
    public static void main(String[] args) throws Exception{
        launch(args);
    }
}