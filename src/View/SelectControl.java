
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SelectControl {
    @FXML
    Button GCode,GCodes,show;
    public void generateCode(Event e){
        Stage stage = new Stage();
        Parent root = null;
        try {        
            root = FXMLLoader.load(getClass().getResource("/View/GeneratePage.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(SelectControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.show();
    }
    public void generateCodes(Event e){
        Stage stage = new Stage();
        Parent root = null;
        try {        
            root = FXMLLoader.load(getClass().getResource("/View/ManyGenerator.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(SelectControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.show();
    }
    public void showCode(Event e){
        Stage stage = new Stage();
        Parent root = null;
        try {        
            root = FXMLLoader.load(getClass().getResource("/View/Result.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(SelectControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.show();
    }
}
