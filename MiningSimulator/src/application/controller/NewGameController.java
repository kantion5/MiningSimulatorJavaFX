package application.controller;

import application.Main;
import application.model.MonsterModel;
import application.model.PlayerModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * begins a new game
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class NewGameController {

	@FXML
	private TextField playerName;

	/**
	 * handle is called when the player tries to return to the main view
	 * 
	 * @param event
	 */
	@FXML
	void handle(ActionEvent event) {
		Main.loadNextView("../Main.fxml");
	}

	/**
	 * handleStartButton is called when the player tries to start a new Game after
	 * entering their name
	 * 
	 * @param event
	 */
	@FXML
	void handleStartButton(ActionEvent event) {
		// Default name set in prompt text will be chosen if the player does not input a
		// name
		if (playerName.getText().equals(""))
			playerName.setText("Bobert");
		// create a new player and start a new world, load the Home.fxml file
		Main.player = new PlayerModel(playerName.getText());
		Main.monster = new MonsterModel();
		Main.loadNextView("../Home.fxml");
		// for debugging, just to make sure the name was saved
		System.out.println(Main.player.getPlayerName());
	}

}