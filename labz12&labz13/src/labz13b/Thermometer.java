package labz13b;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class Thermometer extends Application 
{
	@Override	
	public void start(Stage primaryStage) 
	{
		double answer;
		List<String> options = new ArrayList<>();
		options.add("Celcius to Fahrenheit");
		options.add("Fahrenheit to Celcius");
		
		ChoiceDialog<String> dialogChoice = new ChoiceDialog("Celcius to Fahrenheit",options);
		dialogChoice.setTitle("Chose option!");
		dialogChoice.setHeaderText(null);
		dialogChoice.setContentText("Choose your option");
		dialogChoice.showAndWait();
		
		TextInputDialog dialog1 = new TextInputDialog("0");
		dialog1.setTitle("Thermometer Dialog");
		dialog1.setHeaderText("Thermometer");
		dialog1.setContentText("Please enter your temperature");
		dialog1.showAndWait();
		
		int temp = Integer.parseInt(dialog1.getResult() );
		double temperature = temp;
		
		if(dialogChoice.getResult() == options.get(1))
		{
			answer= (((temperature - 32.0) * 5.0) / 9.0); // formula = Deduct 32, then multiply by 5, then divide by 9
			
			Alert myAlert = new Alert(AlertType.INFORMATION);
			myAlert.setTitle("My Answer Box");
			myAlert.setHeaderText(null);
			myAlert.setContentText("Answer: " + answer);
			myAlert.showAndWait();
		}
		else if(dialogChoice.getResult() == options.get(0))
		{
			answer= ((temperature * 9.0) / 5.0 )+ 32.0; 
			// formula = Multiply by 9, then divide by 5, then add 32
			
			Alert myAlert = new Alert(AlertType.INFORMATION);
			myAlert.setTitle("My Answer Box");
			myAlert.setHeaderText(null);
			myAlert.setContentText("Answer: " + answer);
			myAlert.showAndWait();
		}
	}
		
		public static void main(String[] args)
		{
			launch(args);
		}
}