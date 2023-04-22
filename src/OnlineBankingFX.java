import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OnlineBankingFX extends Application {
    @Override
    public void start(Stage meineStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sb_banking.fxml"));
        Scene meineScene = new Scene(root,700,480);
        meineStage.setTitle("Paticilli Online Banking");
        meineStage.setScene(meineScene);
        meineStage.setResizable(false);

        meineStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
