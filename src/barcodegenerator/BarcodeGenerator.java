
package barcodegenerator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class BarcodeGenerator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Select.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(BarcodeGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene sc= new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Barcode");
        primaryStage.show();
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
