package lodingwindowe;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author MAHMOUD.T
 */
public class LodingWindowe extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);

        //---
        stage.initStyle(StageStyle.UNDECORATED);
        stage.getIcons().add(new Image("icon.png"));
        stage.setScene(scene);
        stage.show();
        muzic();
    }//END;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcom in - MAHMOUD.T - Worled (^^_^^)");
        launch(args);
    }//END main;

    public static void muzic() {
        try {
            Desktop.getDesktop().open(new File("muzicR.mpeg"));
        } catch (IOException ex) {
            System.out.println("---------");
        }
//      ---
        /*
        AudioPlayer MGB = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;

        try {
            BGM = new AudioStream(new FileInputStream("muzic.aac"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            MGB.start(loop);
        } catch (IOException ex) {
            System.out.println(ex);
        }
         */
    }
}//END All;
