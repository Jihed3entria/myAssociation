package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("جمعية الارشاد و الاصلاح");
        Scene scene = new Scene(root,700,475);
        primaryStage.setScene(scene);
        String css = this.getClass().getResource("./style.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.getStyle();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
