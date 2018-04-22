import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(10); // spacing between hbox
    pane.setAlignment(Pos.CENTER); //setting position to centre
    Button btOK = new Button("OK");
    Button btCancel = new Button("Cancel");
    
    Button btNotOk = new Button("Not Ok"); //new button is pressed
    
    OKHandlerClass handler1 = new OKHandlerClass();		//if handler1 button is pressed
    btOK.setOnAction(handler1);							//handler1 class is run
    
    CancelHandlerClass handler2 = new CancelHandlerClass();		//if handler2 button is pressed
    btCancel.setOnAction(handler2);								//handler2 class is run
    
    notOKHandlerClass handler3 = new notOKHandlerClass();
    btNotOk.setOnAction(handler3);
    
    pane.getChildren().addAll(btOK, btCancel,btNotOk); //adding three buttons to the pane
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 100);//Parent root, width, height
    
    primaryStage.setTitle("HandleEvent"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

   // The main method is only needed for the IDE with limited
   // JavaFX support. Not needed for running from the command line.
  public static void main(String[] args) {
    launch(args);
  }
} 

class OKHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked"); 
  }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}

class notOKHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
	  System.out.println("Not OK button clicked"); 
  }
  
}