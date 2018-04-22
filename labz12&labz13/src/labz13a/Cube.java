package labz13a;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Cube extends Application {

	@Override	
public void start(Stage primaryStage) 
{
	Alert myAlert = new Alert(AlertType.INFORMATION);
	myAlert.setTitle("My Message Box");
	myAlert.setHeaderText(null);
	int myArray[] = {1,2,3,4,5,6,7,8,9,10};
	String text = "";
	String squareText = "";
	String cubedText = "";
	String finalText = "";
	
	for(int i = 1; i <= 10;i++){
		text = text + i + "\t";
		squareText = squareText +(i*i) + "\t";
		cubedText = cubedText + (i*i*i) + "\t";
		finalText = text + "\n" + squareText +"\n"+ cubedText + "\n";
	}
	myAlert.setContentText("Num \tSquare \t Cube\n" + finalText);
	
	
		
	myAlert.showAndWait();
}
		
public static void main(String[] args)
{
			launch(args);
}
	

}
