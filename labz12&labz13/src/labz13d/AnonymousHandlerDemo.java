package labz13d;
// Author	: MArk McCleane
// Date		: February 2017
// Purpose	: Demo showing how to use Anonymous Handler functions

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application
{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Hold two buttons in an HBox
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(10);
		
		HBox hBox = new HBox();
		hBox.setAlignment(Pos.CENTER);
		hBox.setSpacing(10);
		
		Button btNew = new Button("New");
		Button btOpen = new Button("Open");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		Button btClose = new Button("Close");
		
		hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);
		vBox.getChildren().addAll(hBox,btClose);		

		// Create and register the handler
		btNew.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override // Override the handle method
			public void handle(ActionEvent e)
			{
				System.out.println("Process New");
			}
		});

		btOpen.setOnAction(e-> System.out.println("Process Open"));

		btSave.setOnAction(e-> System.out.println("Process Save"));

		btPrint.setOnAction(e-> System.out.println("Process Print"));
		
		btClose.setOnAction(e -> {
				System.out.println("Process Close");
				primaryStage.close();
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(vBox, 400, 100);
		primaryStage.setTitle("AnonymousHandlerDemo"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	// The main method is only needed for the IDE with limited
	// JavaFX support. Not needed for running from the command line.
	public static void main(String[] args)
	{
		launch(args);
	}
}
