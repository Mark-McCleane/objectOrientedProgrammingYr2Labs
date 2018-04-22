package labz13a;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Hello extends Application {

	@Override	
public void start(Stage primaryStage) 
{
	Alert myAlert = new Alert(AlertType.INFORMATION);
	myAlert.setTitle("My Message Box");
	myAlert.setHeaderText(null);
	myAlert.setContentText("Hello");
	myAlert.showAndWait();
}
		
public static void main(String[] args)
{
			launch(args);
}
	

}
