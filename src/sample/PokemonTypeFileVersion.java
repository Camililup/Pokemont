package sample;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;


public class PokemonTypeFileVersion extends PokemonType{


        public void openFirstone(Stage fileStage) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("PokemonTypeFileV.fxml"));
    fileStage.setTitle("Poke Type File Type");
            Pane pane = new Pane();



            Scene addFrame = new Scene(pane,280,450);


            fileStage.setScene(addFrame);
            fileStage.show();
    Scene scene = new Scene(root);
    fileStage.setScene(scene); // attach scene to stage
    fileStage.show();
        }

    }






