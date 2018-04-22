package labz13c;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Flags extends Application
{
	public void start(Stage primaryStage) 
	{
		GridPane gpane = new GridPane();
	    gpane.setAlignment(Pos.CENTER);
	    gpane.setHgap(10);
	    gpane.setVgap(10);
	    gpane.setPadding(new Insets(25, 25, 25, 25));
	    
	    Image Ireflag = new Image("images/ireland.png");
	    Image USAflag = new Image("images/USAFlag.png");
	    Image FrenchFlag = new Image("images/French_Flag");
	    Image euFlag = new Image("images/eu.png");
	    ImageView imView1 = new ImageView(Ireflag);
	    ImageView imView2 = new ImageView(USAflag);
	    ImageView imView3 = new ImageView(FrenchFlag);
	    ImageView imView4 = new ImageView(euFlag);
	    
	    gpane.getChildren().addAll(imView1,imView2,imView3,imView4);
   
	    Scene scene = new Scene(gpane);
	    primaryStage.setTitle("ShowImage"); // Set the stage title
	    primaryStage.setScene(scene);       // Place scene in stage
	    primaryStage.show();
    }
   public static void main(String[] args) 
    {
		Application.launch(args);
	}

}
