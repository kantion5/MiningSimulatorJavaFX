package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * basically controls the home menu within the game
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class HomeController {
	@FXML
	private ImageView houseImage;
	@FXML
	private Label daysLabel, goldLabel, energyLabel;

	/**
	 * sets labels in the view to represent some data stored in the PlayerModel
	 * object
	 */
	public void initialize() {
		daysLabel.setText(Integer.toString(Main.player.getDays()));
		goldLabel.setText(Integer.toString(Main.player.getGold()));
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));

		if (Main.player.getGold() > (500 * Main.player.getSpecificDecor(1))) {
			Main.player.setGold(500 * Main.player.getSpecificDecor(1));
		}
	}

	/**
	 * mainMenu is called when the player tries to return to the main menu
	 * 
	 * @param event
	 */
	@FXML
	void mainMenu(ActionEvent event) {
		Main.loadNextView("../Main.fxml");
	}

	/**
	 * handle is called when the player tries to save their game stats and changes
	 * to the save view
	 * 
	 * @param event
	 */
	@FXML
	void handle(ActionEvent event) {
		// TODO : save a players current stats, progress ect.
		Main.loadNextView("../Save.fxml");
	}

	/**
	 * handleSleep is a function that is called when the player sleeps, used to
	 * regain lost energy
	 * 
	 * @param event
	 */
	@FXML
	void handleSleep(ActionEvent event) {
		// TODO : save a player's current stats, progress ect.
		Main.player.setDays(Main.player.getDays() + 1);
		Main.player.setEnergy(10 * (Main.player.getSpecificDecor(2)));
		daysLabel.setText(Integer.toString(Main.player.getDays()));
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));
	}

	/**
	 * handlePlot is called when the player selects the button to go to select a
	 * mine to purchase and changes the view
	 * 
	 * @param event
	 */
	@FXML
	void handlePlot(ActionEvent event) {
		Main.loadNextView("../MineSelection.fxml");
	}

	/**
	 * handleShop is called when the player tries to go to the shop to purchase some
	 * upgrades and changes the view
	 * 
	 * @param event
	 */
	@FXML
	void handleShop(ActionEvent event) {
		Main.loadNextView("../ShopUpgrades.fxml");
	}

}