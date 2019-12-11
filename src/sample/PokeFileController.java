package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;

public class PokeFileController //extends PokemonTypeController{
{
@FXML
    private Button btnf1;
@FXML
    private Button btnf2;
@FXML
private TextArea ts;
@FXML
private ListView listView;
public void Button1Action(ActionEvent event){
FileChooser fc = new FileChooser();
File selectedFile = fc.showOpenDialog(null);


if(selectedFile != null) {
listView.getItems().add(selectedFile.getName());
} else {
    ts.setText("file is not valid");

}

}

    public void Button2Action(ActionEvent event){




    }


}
