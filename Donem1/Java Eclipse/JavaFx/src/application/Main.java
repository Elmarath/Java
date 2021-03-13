package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
	//init() is used to load assets
	public void init() throws Exception{
		System.out.println("Before");
	}
	
	@Override
	public void start(Stage stage)
	{
		stage.setTitle("first application");
		stage.setMinHeight(400);
		stage.setMaxHeight(400);
		stage.setMinWidth(500);
		stage.setMaxWidth(500);
		stage.show();
	}
	
	//works when window is closed
	public void stop() throws Exception{
		System.out.println("After!!!");
	}
}