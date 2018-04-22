package labz13a;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class DialogBox extends Application {

	@Override	
	public void start(Stage primaryStage) 
	{
		TextInputDialog dialog1 = new TextInputDialog("yourname");
		dialog1.setTitle("Text Input Dialog");
		dialog1.setHeaderText("Look, a Text Input Dialog");
		dialog1.setContentText("Please enter your First name:");
		dialog1.showAndWait();
		
		TextInputDialog dialog2 = new TextInputDialog("yourname");
		dialog2.setTitle("Text Input Dialog");
		dialog2.setHeaderText("Look, a Text Input Dialog");
		dialog2.setContentText("Please enter your Second name:");
		dialog2.showAndWait();		
		
		if (dialog2.getResult() != null){
		    System.out.println("Hello " + dialog1.getResult() + " " + dialog2.getResult());
		}
		Alert Alert = new Alert(AlertType.INFORMATION);
		Alert.setTitle("My Message Box");
		Alert.setHeaderText(null);
		Alert.setContentText("Hello " + dialog1.getResult() + " " + dialog2.getResult());
		Alert.showAndWait();
	}

	public static void main(String[] args) {
    		launch(args);
  	}
}