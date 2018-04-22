package labz13c;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MarksCircle extends Application 
{
 @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        // Create a circle and set its properties
        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(100);
        circle1.setRadius(50);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.BLACK);
        
        Pane pane1 = new Pane();
        pane1.getChildren().add(circle1);
        // Create a 200-x-200 scene from the pane, and place the scene in the stage
        Scene scene = new Scene(pane1, 200, 200);
        primaryStage.setTitle("ShowCircle"); // Set the stage title
        primaryStage.setScene(scene);        // Place the scene in the stage
        primaryStage.show();
        Text myName = new Text(65,90,"JavaFX\nBy Mark");//setting size of font and the text
        myName.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 18)); // style of text
        pane1.getChildren().add(myName);
        myName.setFill(Color.AQUA);
        
    }	
	public static void main(String[] args) 
	 {
		launch(args);
	 }

}