package application;

import application.model.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;

/**
 * Main begins the game
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class Main extends Application {

	private static Stage stage;
	public static PlayerModel player;
	public static MonsterModel monster;

	/**
	 * start creates a window for the game to load in
	 * 
	 * @param primaryStage the primary stage for this application, onto which the
	 *                     application scene can be set. The primary stage will be
	 *                     embedded in the browser if the application was launched
	 *                     as an applet. Applications may create other stages, if
	 *                     needed, but they will not be primary stages and will not
	 *                     be embedded in the browser.
	 */
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		loadNextView("../Main.fxml");
		primaryStage.setTitle("Dwarf Mining Simulator");
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * loadNextView is a helper function that will update the stage in main to show
	 * the fxml file, given the String path for the file
	 * 
	 * @param fxmlString String name of the fxml file that will be set on the stage
	 */
	public static void loadNextView(String fxmlString) {
		try {
			// Get the FXML file (just like Scanner, but for FXML files only)
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(fxmlString));

			// Load the FXML (markup language) into a Java object, called AnchorPane
			AnchorPane layout = (AnchorPane) loader.load();

			// Put the layout (a GUI component, called AnchorPane) onto a Scene
			Scene scene = new Scene(layout);

			// Put the Scene onto the Stage
			Main.stage.setScene(scene);

			// Show the app to the user
			Main.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}