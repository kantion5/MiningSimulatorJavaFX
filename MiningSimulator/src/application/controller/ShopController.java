package application.controller;

import java.io.*;
import java.net.*;
import application.Main;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;

/**
 * ShopController is the controller that handles mouse clicks in the
 * ShopUpgrades.fxml file
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 *
 */
public class ShopController {
	@FXML
	Label goldLabel, upgrade1, upgrade2, upgrade3;
	@FXML
	Button handleUpgradesButton;
	@FXML
	Button upgradePlus1, upgradePlus2, upgradePlus3;

	// these are the stars in the shop view. first number represents the row they
	// are in and second
	// represents which star. so upgrade13 would be the pickaxe row and the 3rd
	// star. upgrade33 would be the axe row and the third star
	@FXML
	ImageView upgrade12, upgrade13, upgrade14, upgrade15;
	@FXML
	ImageView upgrade22, upgrade23, upgrade24, upgrade25;
	@FXML
	ImageView upgrade32, upgrade33, upgrade34, upgrade35;

	/**
	 * initialize is used to make sure the view shows the correct amount of upgrades
	 * for what the player has already purchased
	 * 
	 * @throws MalformedURLException
	 */
	public void initialize() throws MalformedURLException {

		// Convert Ores to gold
		int emptyOres[] = new int[5];
		for (int i = 0; i < emptyOres.length; i++) {
			emptyOres[i] = 0;
		}
		Main.player.setGold(Main.player.getGold() + Main.player.getOres()[0] * 1);
		Main.player.setGold(Main.player.getGold() + Main.player.getOres()[1] * 5);
		Main.player.setGold(Main.player.getGold() + Main.player.getOres()[2] * 10);
		Main.player.setGold(Main.player.getGold() + Main.player.getOres()[3] * 20);
		Main.player.setGold(Main.player.getGold() + Main.player.getOres()[4] * 30);
		Main.player.setOres(emptyOres);
		goldLabel.setText(Integer.toString(Main.player.getGold()));

		File file = new File("images/StarFull.png");
		String url = file.toURL().toString();
		Image image = new Image(url);

		File file2 = new File("images/unfilledStar.png");
		String url2 = file2.toURL().toString();
		Image image2 = new Image(url2);

		int[] tools = Main.player.getTools();
		int pickaxe = tools[0];
		int armor = tools[1];
		int axe = tools[2];
		switch (pickaxe) {
		case 1:
			upgrade12.setImage(image2);
			upgrade13.setImage(image2);
			upgrade14.setImage(image2);
			upgrade15.setImage(image2);
			break;

		case 2:
			upgrade12.setImage(image);
			upgrade13.setImage(image2);
			upgrade14.setImage(image2);
			upgrade15.setImage(image2);
			break;

		case 3:
			upgrade12.setImage(image);
			upgrade13.setImage(image);
			upgrade14.setImage(image2);
			upgrade15.setImage(image2);
			break;

		case 4:
			upgrade12.setImage(image);
			upgrade13.setImage(image);
			upgrade14.setImage(image);
			upgrade15.setImage(image2);
			break;

		case 5:
			upgrade12.setImage(image);
			upgrade13.setImage(image);
			upgrade14.setImage(image);
			upgrade15.setImage(image);
			break;
		}

		switch (armor) {
		case 1:
			upgrade22.setImage(image2);
			upgrade23.setImage(image2);
			upgrade24.setImage(image2);
			upgrade25.setImage(image2);
			break;

		case 2:
			upgrade22.setImage(image);
			upgrade23.setImage(image2);
			upgrade24.setImage(image2);
			upgrade25.setImage(image2);
			break;

		case 3:
			upgrade22.setImage(image);
			upgrade23.setImage(image);
			upgrade24.setImage(image2);
			upgrade25.setImage(image2);
			break;
		case 4:
			upgrade22.setImage(image);
			upgrade23.setImage(image);
			upgrade24.setImage(image);
			upgrade25.setImage(image2);
			break;

		case 5:
			upgrade22.setImage(image);
			upgrade23.setImage(image);
			upgrade24.setImage(image);
			upgrade25.setImage(image);
			break;
		}
		switch (axe) {
		case 1:
			upgrade32.setImage(image2);
			upgrade33.setImage(image2);
			upgrade34.setImage(image2);
			upgrade35.setImage(image2);
			break;

		case 2:
			upgrade32.setImage(image);
			upgrade33.setImage(image2);
			upgrade34.setImage(image2);
			upgrade35.setImage(image2);
			break;

		case 3:
			upgrade32.setImage(image);
			upgrade33.setImage(image);
			upgrade34.setImage(image2);
			upgrade35.setImage(image2);
			break;
		case 4:
			upgrade32.setImage(image);
			upgrade33.setImage(image);
			upgrade34.setImage(image);
			upgrade35.setImage(image2);
			break;

		case 5:
			upgrade32.setImage(image);
			upgrade33.setImage(image);
			upgrade34.setImage(image);
			upgrade35.setImage(image);
			break;
		}
	}

	/**
	 * handle is called when the player wants to return to the Home view
	 * 
	 * @param event
	 */
	@FXML
	public void handle(ActionEvent event) {
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handleUpgrades is called when the player tries to switch to the other
	 * upgrades. for example if house upgrades are shown it will switch to tools
	 * upgrades
	 * 
	 * @param event
	 * @throws MalformedURLException
	 */
	@FXML
	public void handleUpgrades(ActionEvent event) throws MalformedURLException {
		File file = new File("images/StarFull.png");
		String url = file.toURL().toString();
		Image image = new Image(url);

		File file2 = new File("images/unfilledStar.png");
		String url2 = file2.toURL().toString();
		Image image2 = new Image(url2);

		// house upgrades
		if (handleUpgradesButton.getText().equals("Home Upgrades")) {
			handleUpgradesButton.setText("Tool Upgrades");
			upgrade1.setText("Table");
			upgrade2.setText("House");
			upgrade3.setText("Bed");
			upgrade14.setVisible(false);
			upgrade15.setVisible(false);
			upgrade24.setVisible(false);
			upgrade25.setVisible(false);
			upgrade34.setVisible(false);
			upgrade35.setVisible(false);
			int[] homeInfo = Main.player.getHouseDecor();
			int table = homeInfo[0];
			int house = homeInfo[1];
			int bed = homeInfo[2];
			switch (table) {
			case 1:
				upgrade12.setImage(image2);
				upgrade13.setImage(image2);
				upgrade14.setImage(image2);
				upgrade15.setImage(image2);
				break;

			case 2:
				upgrade12.setImage(image);
				upgrade13.setImage(image2);
				upgrade14.setImage(image2);
				upgrade15.setImage(image2);
				break;

			case 3:
				upgrade12.setImage(image);
				upgrade13.setImage(image);
				upgrade14.setImage(image2);
				upgrade15.setImage(image2);
				break;
			}
			switch (house) {
			case 1:
				upgrade22.setImage(image2);
				upgrade23.setImage(image2);
				upgrade24.setImage(image2);
				upgrade25.setImage(image2);
				break;

			case 2:
				upgrade22.setImage(image);
				upgrade23.setImage(image2);
				upgrade24.setImage(image2);
				upgrade25.setImage(image2);
				break;

			case 3:
				upgrade22.setImage(image);
				upgrade23.setImage(image);
				upgrade24.setImage(image2);
				upgrade25.setImage(image2);
				break;
			}
			switch (bed) {
			case 1:
				upgrade32.setImage(image2);
				upgrade33.setImage(image2);
				upgrade34.setImage(image2);
				upgrade35.setImage(image2);
				break;

			case 2:
				upgrade32.setImage(image);
				upgrade33.setImage(image2);
				upgrade34.setImage(image2);
				upgrade35.setImage(image2);
				break;

			case 3:
				upgrade32.setImage(image);
				upgrade33.setImage(image);
				upgrade34.setImage(image2);
				upgrade35.setImage(image2);
				break;
			}

		}
		// tool upgrades
		else {
			handleUpgradesButton.setText("Home Upgrades");
			upgrade1.setText("Pickaxe");
			upgrade2.setText("Armor");
			upgrade3.setText("Axe");
			upgrade14.setVisible(true);
			upgrade15.setVisible(true);
			upgrade24.setVisible(true);
			upgrade25.setVisible(true);
			upgrade34.setVisible(true);
			upgrade35.setVisible(true);
			int[] tools = Main.player.getTools();
			int pickaxe = tools[0];
			int armor = tools[1];
			int axe = tools[2];
			switch (pickaxe) {
			case 1:
				upgrade12.setImage(image2);
				upgrade13.setImage(image2);
				upgrade14.setImage(image2);
				upgrade15.setImage(image2);
				break;

			case 2:
				upgrade12.setImage(image);
				upgrade13.setImage(image2);
				upgrade14.setImage(image2);
				upgrade15.setImage(image2);
				break;

			case 3:
				upgrade12.setImage(image);
				upgrade13.setImage(image);
				upgrade14.setImage(image2);
				upgrade15.setImage(image2);
				break;

			case 4:
				upgrade12.setImage(image);
				upgrade13.setImage(image);
				upgrade14.setImage(image);
				upgrade15.setImage(image2);
				break;

			case 5:
				upgrade12.setImage(image);
				upgrade13.setImage(image);
				upgrade14.setImage(image);
				upgrade15.setImage(image);
				break;
			}

			switch (armor) {
			case 1:
				upgrade22.setImage(image2);
				upgrade23.setImage(image2);
				upgrade24.setImage(image2);
				upgrade25.setImage(image2);
				break;

			case 2:
				upgrade22.setImage(image);
				upgrade23.setImage(image2);
				upgrade24.setImage(image2);
				upgrade25.setImage(image2);
				break;

			case 3:
				upgrade22.setImage(image);
				upgrade23.setImage(image);
				upgrade24.setImage(image2);
				upgrade25.setImage(image2);
				break;
			case 4:
				upgrade22.setImage(image);
				upgrade23.setImage(image);
				upgrade24.setImage(image);
				upgrade25.setImage(image2);
				break;

			case 5:
				upgrade22.setImage(image);
				upgrade23.setImage(image);
				upgrade24.setImage(image);
				upgrade25.setImage(image);
				break;
			}
			switch (axe) {
			case 1:
				upgrade32.setImage(image2);
				upgrade33.setImage(image2);
				upgrade34.setImage(image2);
				upgrade35.setImage(image2);
				break;

			case 2:
				upgrade32.setImage(image);
				upgrade33.setImage(image2);
				upgrade34.setImage(image2);
				upgrade35.setImage(image2);
				break;

			case 3:
				upgrade32.setImage(image);
				upgrade33.setImage(image);
				upgrade34.setImage(image2);
				upgrade35.setImage(image2);
				break;
			case 4:
				upgrade32.setImage(image);
				upgrade33.setImage(image);
				upgrade34.setImage(image);
				upgrade35.setImage(image2);
				break;

			case 5:
				upgrade32.setImage(image);
				upgrade33.setImage(image);
				upgrade34.setImage(image);
				upgrade35.setImage(image);
				break;
			}
		}

		/*
		 * Swap the upgrades being shown in the shop, if showing player upgrades, swap
		 * to house upgrades, if showing house, swap to player etc... Change text on the
		 * button to reflect what will be shown when pressed. Change stars according to
		 * what upgrades have been currently purchased.
		 */
	}

	/**
	 * handleUpgradeOne is called when the player tries to click to top "plus" in
	 * the view, then this function checks if the player has the required funds to
	 * purchase and updates the view
	 * 
	 * @param event
	 * @throws MalformedURLException
	 */
	@FXML
	public void handleUpgradeOne(MouseEvent event) throws MalformedURLException {
		File file = new File("images/StarFull.png");
		String url = file.toURL().toString();
		Image image = new Image(url);

		// this code is run if they are in the tool upgrades
		if (handleUpgradesButton.getText().equals("Home Upgrades")) {
			int[] currentTools = Main.player.getTools();

			// tool number, upgrade number //upgrade # = what upgrade tier
			if (Main.player.upgradeTools(0, currentTools[0])) {
				goldLabel.setText(Integer.toString(Main.player.getGold()));
				switch (currentTools[0]) {
				case 2:
					upgrade12.setImage(image);
					break;

				case 3:
					upgrade12.setImage(image);
					upgrade13.setImage(image);
					break;

				case 4:
					upgrade12.setImage(image);
					upgrade13.setImage(image);
					upgrade14.setImage(image);
					break;

				case 5:
					upgrade12.setImage(image);
					upgrade13.setImage(image);
					upgrade14.setImage(image);
					upgrade15.setImage(image);
					break;

				}
			}
		}
		// this code is run if they are in the house upgrades
		else {
			int[] currentHouseUpgrades = Main.player.getHouseDecor();

			if (Main.player.renovateHouse(0, currentHouseUpgrades[0])) {
				goldLabel.setText(Integer.toString(Main.player.getGold()));
				switch (currentHouseUpgrades[0]) {
				case 2:
					upgrade12.setImage(image);
					break;

				case 3:
					upgrade12.setImage(image);
					upgrade13.setImage(image);
					break;
				}
			}
		}

	}

	/**
	 * handleUpgradeTwo is called when the player tries to click to top "plus" in
	 * the view, then this function checks if the player has the required funds to
	 * purchase and updates the view
	 * 
	 * @param event
	 * @throws MalformedURLException
	 */
	@FXML
	public void handleUpgradeTwo(MouseEvent event) throws MalformedURLException {
		File file = new File("images/StarFull.png");
		String url = file.toURL().toString();
		Image image = new Image(url);

		// this code is run if they are in the tool upgrades
		if (handleUpgradesButton.getText().equals("Home Upgrades")) {
			int[] currentTools = Main.player.getTools();

			if (Main.player.upgradeTools(1, currentTools[1])) {
				goldLabel.setText(Integer.toString(Main.player.getGold()));
				switch (currentTools[1]) {
				case 2:
					upgrade22.setImage(image);
					break;

				case 3:
					upgrade22.setImage(image);
					upgrade23.setImage(image);
					break;

				case 4:
					upgrade22.setImage(image);
					upgrade23.setImage(image);
					upgrade24.setImage(image);
					break;

				case 5:
					upgrade22.setImage(image);
					upgrade23.setImage(image);
					upgrade24.setImage(image);
					upgrade25.setImage(image);
					break;

				}
			}
		}
		// this code is run if they are in the house upgrades
		else {
			int[] currentHouseUpgrades = Main.player.getHouseDecor();

			if (Main.player.renovateHouse(1, currentHouseUpgrades[1])) {
				goldLabel.setText(Integer.toString(Main.player.getGold()));
				switch (currentHouseUpgrades[1]) {
				case 2:
					upgrade22.setImage(image);
					break;

				case 3:
					upgrade22.setImage(image);
					upgrade23.setImage(image);
					break;
				}
			}
		}

	}
	/*
	 * Purchase upgrade in the second slot, use current name in label to determine
	 * what to upgrade Take away gold, inform player if they have an insufficient
	 * amount
	 */

	/**
	 * handleUpgradeThree is called when the player tries to click to top "plus" in
	 * the view, then this function checks if the player has the required funds to
	 * purchase and updates the view
	 * 
	 * @param event
	 * @throws MalformedURLException
	 */
	@FXML
	public void handleUpgradeThree(MouseEvent event) throws MalformedURLException {
		File file = new File("images/StarFull.png");
		String url = file.toURL().toString();
		Image image = new Image(url);

		// this code is run if they are in the tool upgrades
		if (handleUpgradesButton.getText().equals("Home Upgrades")) {
			int[] currentTools = Main.player.getTools();

			if (Main.player.upgradeTools(2, currentTools[2])) {
				goldLabel.setText(Integer.toString(Main.player.getGold()));
				switch (currentTools[2]) {
				case 2:
					upgrade32.setImage(image);
					break;

				case 3:
					upgrade32.setImage(image);
					upgrade33.setImage(image);
					break;

				case 4:
					upgrade32.setImage(image);
					upgrade33.setImage(image);
					upgrade34.setImage(image);
					break;

				case 5:
					upgrade32.setImage(image);
					upgrade33.setImage(image);
					upgrade34.setImage(image);
					upgrade35.setImage(image);
					break;
				}
			}
		}
		// this code is run if they are in the house upgrades
		else {
			int[] currentHouseUpgrades = Main.player.getHouseDecor();

			if (Main.player.renovateHouse(2, currentHouseUpgrades[2])) {
				goldLabel.setText(Integer.toString(Main.player.getGold()));
				switch (currentHouseUpgrades[2]) {
				case 2:
					upgrade32.setImage(image);
					break;

				case 3:
					upgrade32.setImage(image);
					upgrade33.setImage(image);
					break;
				}
			}
		}

	}
}