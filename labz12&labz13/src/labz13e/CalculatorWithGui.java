package labz13e;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorWithGui extends Application 
{

	
	@Override
	public void start(Stage primaryStage)
	{
		GridPane gridPane= new GridPane();
		gridPane.setHgap(5); //The width of the horizontal gaps between columns
		gridPane.setVgap(5); //The width of the vertical gaps between columns
		gridPane.add(new Label("Annual Interest Rate:"),0,0);
		Scene scene = new Scene(gridPane,400,250);
		primaryStage.setTitle("Loan Calculator");	//title
		primaryStage.setScene(scene);	//place the scene in stage
		primaryStage.show(); 	//display the stage
	}
	}