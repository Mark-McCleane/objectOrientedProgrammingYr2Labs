package labz13c;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowElipse extends Application 
{
	public void start(Stage primaryStage) 
    {
		/*Ellipse ellipse1 = new Ellipse();
		ellipse1.setCenterX(100);
		ellipse1.setCenterY(100);
		ellipse1.setRadiusX(100);
		ellipse1.setRadiusY(50);
		ellipse1.setRotate(160);		*/
		Ellipse[] ellipseArray = new Ellipse[16];	
		int rotateTemp = 200;				//since ellipse 1 is 160 we need to decrement it
									// by ten each time we run for loop
		Random rand = new Random();
		for(int i = 0; i < ellipseArray.length; i++)
		{
			int r = rand.nextInt(255) + 1; // highest rgb is 255,255,255
			int g = rand.nextInt(255) + 1;		//get random colors for stroke
			int b = rand.nextInt(255) + 1;
			ellipseArray[i]= new Ellipse();
			ellipseArray[i].setCenterX(100.0f);
			ellipseArray[i].setCenterY(100.0f);
			ellipseArray[i].setRadiusX(50.0f);
			ellipseArray[i].setRadiusY(100.0f);
			ellipseArray[i].setRotate(rotateTemp);
			ellipseArray[i].setStroke(Color.rgb(r,g,b));
			ellipseArray[i].setFill(Color.WHITE);
			rotateTemp-= 11.25; 
			if(rotateTemp == 0){
				rotateTemp = 360;
			}
		}
		Pane pane1 = new Pane();
        pane1.getChildren().addAll(ellipseArray);
       // pane1.getChildren().add(ellipse1);
        Scene scene = new Scene(pane1, 200, 200);
        primaryStage.setTitle("ShowEllipse"); // Set the stage title
        primaryStage.setScene(scene);        // Place the scene in the stage
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
