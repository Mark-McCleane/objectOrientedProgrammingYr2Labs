package labz13a;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class Calculator extends Application 
{
	@Override	
	public void start(Stage primaryStage) 
	{
		double ans = 0;
		TextInputDialog dialog1 = new TextInputDialog("0");
		dialog1.setTitle("Calculator Dialog");
		dialog1.setHeaderText("Calculator");
		dialog1.setContentText("Please enter your number");
		dialog1.showAndWait();
		int num1 = Integer.parseInt(dialog1.getResult());
		
		List<String> operators = new ArrayList<>();
		operators.add("Square");
		operators.add("Inverse");
		operators.add("Cube");
		operators.add("+");
		operators.add("-");
		operators.add("*");
		operators.add("/");
		operators.add("Times Table");
		
		ChoiceDialog<String> dialogChoice = new ChoiceDialog("Square",operators);
		dialogChoice.setTitle("Chose operator!");
		dialogChoice.setHeaderText("Look a Choice Dialog");
		dialogChoice.setContentText("Choose your operator");
		dialogChoice.showAndWait();
		
		
		if(dialogChoice.getResult() == operators.get(0))
		{
			ans = Math.pow(num1,2);			//power
			System.out.println(ans);
		}
		else if(dialogChoice.getResult() == operators.get(1)){
			double num2Double = num1;
			ans = (1 / num2Double);				//inverse
			System.out.println(ans);
		}
		else if(dialogChoice.getResult() == operators.get(2))
		{
			ans = (num1 * num1);			//cube
			System.out.println(ans);
		}
		else if(dialogChoice.getResult() == operators.get(7)){
			String answer ="";
			for(int i=1;i<=10;i++){
				answer = answer + num1 + " x " + i + " = " + (num1 * i) + "\n" ;		//times table
			}
			Alert myAlert = new Alert(AlertType.INFORMATION);
			myAlert.setTitle("My Answer Box");
			myAlert.setHeaderText("Answer");
			myAlert.setContentText("\tTimes Table\n" + answer); 
			myAlert.showAndWait();
		}
		else
		{
			TextInputDialog dialog2 = new TextInputDialog("0");
				
			dialog2.setTitle("Calculator Dialog");
			dialog2.setHeaderText("Calculator");
			dialog2.setContentText("Please enter your second number");
			dialog2.showAndWait();
			int num2 = Integer.parseInt(dialog1.getResult());
			
			if(dialogChoice.getResult() == operators.get(3))
			{
				
				ans = (num1 + num2);	//+
				System.out.println(ans);
			}
			else if(dialogChoice.getResult() == operators.get(4))
			{
				ans = (num1 - num2);		//-
				System.out.println(ans);
			}
			else if(dialogChoice.getResult() == operators.get(5))
			{
				ans = (num1 * num2);			//*
			}
			else if(dialogChoice.getResult() == operators.get(6))
			{
				ans = (num1 / num2);			// '/'
			}
		}
		if(dialogChoice.getResult() != operators.get(7))
		{
			Alert myAlert = new Alert(AlertType.INFORMATION);
			myAlert.setTitle("My Answer Box");
			myAlert.setHeaderText("Answer");
			myAlert.setContentText("Answer = " + ans); 
			myAlert.showAndWait();
		}
	}
			
public static void main(String[] args) 
{
	launch(args);
}
}