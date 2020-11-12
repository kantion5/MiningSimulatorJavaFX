package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * controls main menu
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class MainController {
	/**
	 * handle is called when the player tries to start a new game and updates the
	 * view
	 * 
	 * @param event
	 */
	@FXML
	void handle(ActionEvent event) {
		Main.loadNextView("../NewGame.fxml");
	}

	/**
	 * loadGame is called when the player tries to load a game and updates the view
	 * 
	 * @param event
	 */
	@FXML
	void loadGame(ActionEvent event) {
		Main.loadNextView("../Load.fxml");
	}

}
