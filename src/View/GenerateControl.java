
package View;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;


public class GenerateControl {
    
    @FXML
    Button btn,btnn;
    @FXML
    TextField TheID;
    @FXML
    Label lb;
    String name = null;
    
    public void generate() throws IOException{
        name = TheID.getText();
        Code128Bean code = new Code128Bean();
        code.setHeight(15f);
        code.setModuleWidth(0.3);
        code.setQuietZone(10);
        code.doQuietZone(true);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(baos, "image/x-png", 400, BufferedImage.TYPE_BYTE_BINARY, false, 0);
        code.generateBarcode(canvas, TheID.getText());
        try {
            canvas.finish();
        } catch (IOException ex) {
            Logger.getLogger(GenerateControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileOutputStream fos = null;
        try {
            File out = new File("src\\BarCodes\\"+name+".png");
            fos = new FileOutputStream(out);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fos.write(baos.toByteArray());
        } catch (IOException ex) {
            Logger.getLogger(GenerateControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        fos.flush();
        fos.close();
        lb.setText("Generated");

    }
    
}
