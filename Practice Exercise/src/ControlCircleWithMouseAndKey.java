// Author	: Mark McCleane
// Date		: Mar 2017
// Purpose	: Demo of key & mouse event handling together

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {
	private CirclePane circlePane = new CirclePane();
	
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
	
	// Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    hBox.getChildren().add(btEnlarge); 
    hBox.getChildren().add(btShrink);		//spacing alignment and adding buttons
    
    // Create and register the handler
    btEnlarge.setOnAction(e -> circlePane.enlarge());		//event enlarge
    btShrink.setOnAction(e -> circlePane.shrink());			//event shrink
    
   circlePane.setOnMouseClicked(e -> {
      if (e.getButton() == MouseButton.PRIMARY) { 	//if left click enlarge
        circlePane.enlarge();
      }
      else if (e.getButton() == MouseButton.SECONDARY) { 	//if right click shrink
        circlePane.shrink();
      }
    });
    
    circlePane.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.U) {		//if u is pressed enlarge 
        circlePane.enlarge();
      }
      else if (e.getCode() == KeyCode.D) {		// if d is pressed shrink
        circlePane.shrink();
      }
    });
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 300, 150);
    primaryStage.setTitle("ControlCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    circlePane.requestFocus();
  }
  
  // The main method is only needed for the IDE with limited
  // JavaFX support. Not needed for running from the command line.
  public static void main(String[] args) {
    launch(args);
  }
}