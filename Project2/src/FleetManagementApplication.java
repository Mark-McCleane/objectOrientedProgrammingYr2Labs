import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class FleetManagementApplication extends Application 
{
	private TextField NumberOfBoats = new TextField();
	private TextField boat1 = new TextField();
	private TextField boat2 = new TextField();
	private TextField boat3= new TextField();
	private TextField boat4 = new TextField();
	private TextField boat5 = new TextField();
	private TextField boat6 = new TextField();
	private TextField boat7 = new TextField();
	
	private TextField fleet1 = new TextField();
	private TextField fleet2 = new TextField();
	private TextField fleet3= new TextField();
	private TextField fleet4 = new TextField();
	private TextField fleet5 = new TextField();
	private TextField fleet6 = new TextField();
	private TextField fleet7 = new TextField();
	private Button btSubmit = new Button("Submit");
	
	@Override
	public void start(Stage primaryStage)		//screen 1
	{
		ArrayList<String> choose = new ArrayList<>();
		choose.add("New Fleet Management Company");
		choose.add("View Fleet Management Company Details");
		
		ChoiceDialog<String> dialogChoice = new ChoiceDialog("Choose an Option",choose);
		dialogChoice.setTitle("Chose an option!");
		dialogChoice.setHeaderText("Fleet Management Application");
		dialogChoice.setContentText("Choose your option you want to use");
		dialogChoice.showAndWait();
		
		if(dialogChoice.getResult() == choose.get(0)){
			//FleetManagementCompanyName();
			
			GridPane gridPane= new GridPane();
			gridPane.setHgap(5); //The width of the horizontal gaps between columns
			gridPane.setVgap(5); //The width of the vertical gaps between columns
			gridPane.add(new Label("Number Of Boats"),0,0); 	//adding labels
			gridPane.add(NumberOfBoats,1,0);	//adding figure and position
				//boats
			gridPane.add(new Label("Boats"),0,1); 
			gridPane.add(boat1,1,1);
			gridPane.add(boat2,1,2);
			gridPane.add(boat3,1,3);
			gridPane.add(boat4,1,4);
			gridPane.add(boat5,1,5);
			gridPane.add(boat6,1,6);
			gridPane.add(boat7,1,7);
			
			gridPane.setAlignment(Pos.CENTER); //always center of program for grid pane
			NumberOfBoats.setAlignment(Pos.BOTTOM_RIGHT); //bottom right of position (1,0) of grid pane
			boat1.setAlignment(Pos.BOTTOM_LEFT);
			boat2.setAlignment(Pos.BOTTOM_LEFT);
			boat3.setAlignment(Pos.BOTTOM_LEFT); //boats alignment
			boat4.setAlignment(Pos.BOTTOM_LEFT);
			boat5.setAlignment(Pos.BOTTOM_LEFT);
			boat6.setAlignment(Pos.BOTTOM_LEFT);
			boat7.setAlignment(Pos.BOTTOM_LEFT);
			
			
			//Fleets
			gridPane.add(new Label("Fleets"),2,1); 
			gridPane.add(fleet1,3,1);
			gridPane.add(fleet2,3,2);
			gridPane.add(fleet3,3,3);
			gridPane.add(fleet4,3,4);
			gridPane.add(fleet5,3,5);
			gridPane.add(fleet6,3,6);
			gridPane.add(fleet7,3,7);
			gridPane.add(btSubmit,3,8);
			GridPane.setHalignment(btSubmit, HPos.CENTER);
			fleet1.setAlignment(Pos.BOTTOM_LEFT);
			fleet2.setAlignment(Pos.BOTTOM_LEFT);
			fleet3.setAlignment(Pos.BOTTOM_LEFT); //boats alignment
			fleet4.setAlignment(Pos.BOTTOM_LEFT);
			fleet5.setAlignment(Pos.BOTTOM_LEFT);
			fleet6.setAlignment(Pos.BOTTOM_LEFT);
			fleet7.setAlignment(Pos.BOTTOM_LEFT);
			
			
			//btSubmit.setOnAction(new CalcHandlerClass() );
			Scene scene = new Scene(gridPane,500,300);			
			primaryStage.setTitle("Add a Boat");	//title
			primaryStage.setScene(scene);	//place the scene in stage
			primaryStage.show(); 	//display the stage
		}
		if(dialogChoice.getResult() == choose.get(0)){
			//view details
			
		}
	}
	public void FleetManagementCompanyName()
	{
		TextInputDialog dialog1 = new TextInputDialog("Fleet Management Company Name");
		dialog1.setTitle("Set Fleet Management Company Name");
		dialog1.setHeaderText("Enter Your Fleet Management Company Name:");
		dialog1.showAndWait();
		FleetManagement fm = new FleetManagement();
		fm.setName(dialog1.getResult());
	}
	/*private void declareInputs() 
	{
		ArrayList<Boat> boats = new ArrayList<>();
	//	Boat temp = "lol";
		
		/*int year = Integer.parseInt(tfNumberOfYears.getText() );
		double loanAmount = Double.parseDouble(tfLoanAmount.getText());
		
		Loan loan = new Loan(interest,year,loanAmount);
		
		tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment() ) );
		tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment() ) );*/
	//}
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	/*class CalcHandlerClass implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent e){
//			declareInputs();
		}
	}*/
}