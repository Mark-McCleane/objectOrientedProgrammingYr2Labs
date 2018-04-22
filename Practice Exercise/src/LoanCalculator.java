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
import javafx.beans.InvalidationListener;

public class LoanCalculator extends Application 
{
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment= new TextField();
	private TextField tfTotalPayment = new TextField();
	private Button btCalculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage)
	{
		GridPane gridPane= new GridPane();
		gridPane.setHgap(5); //The width of the horizontal gaps between columns
		gridPane.setVgap(5); //The width of the vertical gaps between columns
		gridPane.add(new Label("Annual Interest Rate:"),0,0); 	//adding labels
		gridPane.add(tfAnnualInterestRate,1,0);	//adding figure and position
		gridPane.add(new Label("Number Of Years:"),0,1);
		gridPane.add(tfNumberOfYears,1,1);
		gridPane.add(new Label("Loan Amount"),0,2);
		gridPane.add(tfLoanAmount,1,2);
		gridPane.add(new Label("Monthly Payment"),0,3);
		gridPane.add(tfMonthlyPayment,1,3);
		gridPane.add(new Label("Total Payment"),0,4);
		gridPane.add(tfTotalPayment,1,4);
		gridPane.add(btCalculate,1,5);
		
		gridPane.setAlignment(Pos.CENTER); //always center of program for gridpane
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT); //bottom right of position (1,0) of gridpane
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT); 
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);		//set to uneditable
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		
		//process events
		btCalculate.setOnAction(new CalcHandlerClass() );		//when button is clicked it runs
		//create a scene
		Scene scene = new Scene(gridPane,400,250);
		primaryStage.setTitle("Loan Calculator");	//title
		primaryStage.setScene(scene);	//place the scene in stage
		primaryStage.show(); 	//display the stage
	}
	private void calculateLoanPayment() 
	{
		double interest = Double.parseDouble(tfAnnualInterestRate.getText()); 
		int year = Integer.parseInt(tfNumberOfYears.getText() );
		double loanAmount = Double.parseDouble(tfLoanAmount.getText());
		
		Loan loan = new Loan(interest,year,loanAmount);
		
		tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment() ) );
		tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment() ) );
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	 }
	
	class CalcHandlerClass implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent e){
			calculateLoanPayment();
		}
	}
}