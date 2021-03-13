import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.*;

import javax.swing.tree.ExpandVetoException;

public class deneme extends Application {
    private Stage primaryStage;
    private BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Dry Cleaning Manager");
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(deneme.class.getResource("deneme.fxml"));

            AnchorPane ap = loader.load();
            Scene sc = new Scene(ap);
            primaryStage.setScene(sc);
            primaryStage.show();

        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}