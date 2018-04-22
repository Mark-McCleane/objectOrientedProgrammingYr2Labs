package labz13f;

import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ConverTemp extends Application 
{
	public TextField celsius = new TextField();
	public TextField fahrenheit = new TextField();
	int flag;
	@Override
	public void start(Stage primaryStage)
	{	
		GridPane gridPane= new GridPane();
		gridPane.setHgap(5); //The width of the horizontal gaps between columns
		gridPane.setVgap(5); //The width of the vertical gaps between columns*/
		gridPane.add(new Label("Celsius:"),0,0); 	//adding labels
		gridPane.add(celsius,1,0);	//adding figure and position
		gridPane.add(new Label("Fahrenheit:"),2,0); 	//adding labels
		gridPane.add(fahrenheit,3,0);	//adding figure and position
		gridPane.setAlignment(Pos.CENTER);
		
			flag = 0;
			celsius.textProperty().addListener(new InvalidationListener(){
			public void invalidated(Observable ov) {
				if(flag == 0)
				{
					flag = 1;
					double fah = calculateFahrenheit();
					fahrenheit.setText(Double.toString(fah) );	
				}
				
			}});flag = 0;
			
			
			fahrenheit.textProperty().addListener(new InvalidationListener(){
			public void invalidated(Observable ov) {
				if(flag == 0){
					flag = 1;
					double cel = calculateCelsius();
					celsius.setText(Double.toString(cel) );
				}
				flag = 0;
			}});
			
		
		Scene scene = new Scene(gridPane,430,150);
		primaryStage.setTitle("Listeners Demo");	//title
		primaryStage.setScene(scene);	//place the scene in stage
		primaryStage.show(); 	//display the stage
	}
	
		public static void main(String[] args)
		{
			Application.launch(args);
		}
		public double calculateFahrenheit(){
			double temperature = Double.parseDouble(celsius.getText());
			double answer = ((temperature * 9.0) / 5.0 ) + 32.0;
			return answer;
		}
		
		public double calculateCelsius(){
			double temperature = Double.parseDouble(fahrenheit.getText());
			double answer= ((temperature - 32.0) * 5.0) / 9.0;
			return answer;
		}
}
	