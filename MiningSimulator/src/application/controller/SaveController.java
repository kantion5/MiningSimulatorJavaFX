package application.controller;

import java.io.*;
import application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.Label;

/**
 * saves the game
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class SaveController {

	@FXML
	Label nameSave1, goldSave1, plotsSave1;
	@FXML
	Label nameSave2, goldSave2, plotsSave2;
	@FXML
	Label nameSave3, goldSave3, plotsSave3;

	/**
	 * initialize the information in the different file selections if there are
	 * saves
	 */
	public void initialize() {

		readSaveFiles("data/PlayerSave1.txt", 1);
		readSaveFiles("data/PlayerSave2.txt", 2);
		readSaveFiles("data/PlayerSave3.txt", 3);
	}

	/**
	 * used in initialize to set up data
	 * 
	 * @param filePath String, file path for the player save data
	 * @param slot     int, used to determine which slot was selected
	 */
	public void readSaveFiles(String filePath, int slot) {
		String currentString;
		String[] tokens;
		try {
			FileReader reader = new FileReader(new File(filePath));
			BufferedReader buffer = new BufferedReader(reader);
			while ((currentString = buffer.readLine()) != null) {
				tokens = currentString.split(",");
				if (slot == 1) {
					nameSave1.setText("Name: " + tokens[0]);
					goldSave1.setText("Gold: " + tokens[1]);
					plotsSave1.setText("Owned Plots: " + tokens[2]);
				} else if (slot == 2) {
					nameSave2.setText("Name: " + tokens[0]);
					goldSave2.setText("Gold: " + tokens[1]);
					plotsSave2.setText("Owned Plots: " + tokens[2]);
				} else if (slot == 3) {
					nameSave3.setText("Name: " + tokens[0]);
					goldSave3.setText("Gold: " + tokens[1]);
					plotsSave3.setText("Owned Plots: " + tokens[2]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * called when the player tries to return to the home view
	 * 
	 * @param event
	 */
	@FXML
	void handle(ActionEvent event) {
		Main.player.saveGame(Main.player.getSaveNumber());
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handleSave1 is called when the player tries to save the the 1st file
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void handleSave1(ActionEvent event) throws IOException {
		Main.player.setSaveNumber(1);
	}

	/**
	 * handleSave2 is called when the player tries to save the the 2nd file
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void handleSave2(ActionEvent event) throws IOException {
		Main.player.setSaveNumber(2);
	}

	/**
	 * handleSave3 is called when the player tries to save the the 3rd file
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void handleSave3(ActionEvent event) throws IOException {
		Main.player.setSaveNumber(3);
	}

	/**
	 * handleHome is called when the player tries to return to the home view
	 * 
	 * @param event
	 */
	@FXML
	void handleHome(ActionEvent event) {
		Main.loadNextView("../Home.fxml");
	}
}
