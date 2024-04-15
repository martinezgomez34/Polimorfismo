package com.eduard034.polimorfismo;

import com.eduard034.polimorfismo.models.IComunication;
import com.eduard034.polimorfismo.models.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;



import java.io.IOException;
public class HelloApplication extends Application {
    private static Stage stageView;
    private static Stage stageRoot;
    public static IComunication comunication;
    public static Date date = new Date(comunication);
    public static Date getUpdate(){return date;}
    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        return fxmlLoader.load();
    }

    public static Stage getStageView() {
        return stageView;
    }

    public static void main(String[] args) {
        launch();
    }
}