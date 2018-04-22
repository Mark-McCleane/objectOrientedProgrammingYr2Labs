package labz13b;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circle extends Application 
{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        
        
        Image image1 = new Image("file:images/ireland.png");
        ImageView imageView2 = new ImageView(image1);  // 2nd IV forces image to
        imageView2.setFitHeight(100);                 // fit into 100-x-100
        imageView2.setFitWidth(100);                  // pixel area
      //  pane.getChildren().add(imageView2);


      /*  ImageView imageView2 = new ImageView(image1);
        imageView2.setFitHeight(100);                 // fit into 100-x-100
        imageView2.setFitWidth(100);*/                 // pixel area
     //  circle.setFill(color.imageView2);

        // Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(imageView2);
     
        
        // Create a 200-x-200 scene from the pane, and place the scene in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle"); // Set the stage title
        primaryStage.setScene(scene);        // Place the scene in the stage
        primaryStage.show();                 // Display the stage
    }
    public static void main(String[] args) 
    {
    	launch(args);
    }
    }