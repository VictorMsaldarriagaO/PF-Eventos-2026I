package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StarApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StarApplication.class.getResource(""));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }
}
