package application.controller;

import java.io.*;

import application.Main;
import application.model.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * makes the load screen functional
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class LoadScreenController {

	@FXML
	Label nameSave1, goldSave1, plotsSave1;
	@FXML
	Label nameSave2, goldSave2, plotsSave2;
	@FXML
	Label nameSave3, goldSave3, plotsSave3;

	/**
	 * handle creates a new PlayerModel object and sets its data on playerSave1 in
	 * txt files
	 * 
	 * @param event
	 */
	@FXML
	void handle(ActionEvent event) {
		String currentString;
		String[] tokens;
		String name = "";
		int gold;
		try {
			FileReader reader = new FileReader(new File("data/PlayerSave1.txt"));
			BufferedReader buffer = new BufferedReader(reader);
			while ((currentString = buffer.readLine()) != null) {
				tokens = currentString.split(",");
				name = tokens[0];
				gold = Integer.parseInt(tokens[1]);
				Main.player = new PlayerModel(name);
				Main.player.setGold(gold);
				// need to set the plots the player has already
			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handle1 creates a new PlayerModel object and sets its data on playerSave2 in
	 * txt file
	 * 
	 * @param event
	 */
	@FXML
	public void handle1(ActionEvent event) {
		String currentString;
		String[] tokens;
		String name = "";
		int gold;
		try {
			FileReader reader = new FileReader(new File("data/PlayerSave2.txt"));
			BufferedReader buffer = new BufferedReader(reader);
			while ((currentString = buffer.readLine()) != null) {
				tokens = currentString.split(",");
				name = tokens[0];
				gold = Integer.parseInt(tokens[1]);
				Main.player = new PlayerModel(name);
				Main.player.setGold(gold);
				// need to set the plots the player has already
			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handle2 creates a new PlayerModel object and sets its data on playerSave3 in
	 * txt file
	 * 
	 * @param event
	 */
	@FXML
	public void handle2(ActionEvent event) {
		String currentString;
		String[] tokens;
		String name = "";
		int gold;
		try {
			FileReader reader = new FileReader(new File("data/PlayerSave3.txt"));
			BufferedReader buffer = new BufferedReader(reader);
			while ((currentString = buffer.readLine()) != null) {
				tokens = currentString.split(",");
				name = tokens[0];
				gold = Integer.parseInt(tokens[1]);
				Main.player = new PlayerModel(name);
				Main.player.setGold(gold);
				// need to set the plots the player has already

			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * used in initialize to set up the view with the player information before
	 * loading
	 * 
	 * @param filePath String, path for the player save file
	 * @param slot     int, slot is used to determine which slot the player selected
	 */
	public void initialize() {
		readSaveFiles("data/PlayerSave1.txt", 1);
		readSaveFiles("data/PlayerSave2.txt", 2);
		readSaveFiles("data/PlayerSave3.txt", 3);
	}

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
				}
				if (slot == 2) {
					nameSave2.setText("Name: " + tokens[0]);
					goldSave2.setText("Gold: " + tokens[1]);
					plotsSave2.setText("Owned Plots: " + tokens[2]);
				}
				if (slot == 3) {
					nameSave3.setText("Name: " + tokens[0]);
					goldSave3.setText("Gold: " + tokens[1]);
					plotsSave3.setText("Owned Plots: " + tokens[2]);
				}
			}
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
