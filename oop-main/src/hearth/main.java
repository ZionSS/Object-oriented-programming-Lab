/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearth;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.SetBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;
/**
 *
 * @author STSNX
 */
public class main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("c.css").toExternalForm());
        //Deck deck = new Deck();
        Pane menuRoot = new Pane();
        Pane ruleRoot = new Pane();
        menuRoot.setPrefSize(1205, 783);
        ruleRoot.setPrefSize(1205, 783);
        Image img = new Image("/img/mainmenu.png");
        Image ruleImg = new Image("/img/rule.png");
        ImageView bg = new ImageView();
        ImageView ruleBg = new ImageView();
        bg.setFitHeight(783);
        bg.setFitWidth(1205);
        bg.setImage(img);
        menuRoot.getChildren().add(bg);
        ruleBg.setFitHeight(783);
        ruleBg.setFitWidth(1205);
        ruleBg.setImage(ruleImg);
        ruleRoot.getChildren().add(ruleBg);
        
        Scene ruleScene = new Scene(ruleRoot); 
        VBox box;
        box = new VBox(
                3,
                new MenuItem("PLAY", () ->stage.setScene(scene)),
                new MenuItem("HOW TO PLAY", () -> stage.setScene(ruleScene)),
                new MenuItem("QUIT", () -> Platform.exit())
        );
        box.setBackground(new Background(
                new BackgroundFill(Color.web("black", 0.6), null, null)
        ));
        box.setTranslateX(602.5-100);
        box.setTranslateY(783*3/5);

        menuRoot.getChildren().addAll(
                new ImageView(img),
                box
        );
        
        Scene menuScene = new Scene(menuRoot); 
        
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                stage.setScene(menuScene);
            }
        });
        ruleScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                stage.setScene(menuScene);
            }
        });
        
        //deck.shuffle();
       // deck.show();
        
        stage.setScene(menuScene);
        stage.show();
        
        
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }

   
}
