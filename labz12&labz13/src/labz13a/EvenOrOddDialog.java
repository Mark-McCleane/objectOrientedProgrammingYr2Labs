package labz13a;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class EvenOrOddDialog extends Application 
{

	@Override	
	public void start(Stage primaryStage) 
	{
		TextInputDialog dialog1 = new TextInputDialog("Odd or Even");
		dialog1.setTitle("Text Input Dialog");
		dialog1.setHeaderText("Look, a Text Input Dialog");
		dialog1.setContentText("Please enter your number");
		dialog1.showAndWait();
		int answer = Integer.parseInt(dialog1.getResult());
		
		if(answer % 2 == 1){
			System.out.println("The number " + dialog1.getResult() + " is odd!!");
		}
		else{
			System.out.println("The number " + dialog1.getResult() + " is even!!");
		}

	}
public static void main(String[] args) {
	launch(args);
}
}