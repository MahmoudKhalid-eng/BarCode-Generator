
package View;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ResultControl{
    @FXML
    ImageView img;
    @FXML
    TextField code;
    @FXML
    Button showBtn;
    
    int name ;
    public void show(){
        name = Integer.parseInt(code.getText());
        Image i = null;
        try{
            i = new Image("/BarCodes/"+name+".png");
        }
        catch(Exception ee){
            System.out.println("File not found");
        }
        img.setImage(i);
    }
    
}
