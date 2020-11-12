package application.model;

import java.io.*;
import java.util.*;

/**
 * PlayerModel is used to represent the player and hold the players data while
 * playing the game. There is a global variable in main that is instantiated
 * when the player selects new game or load game.
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 *
 */
public class PlayerModel {
	private int playerHealth, energy, gold, days, selectedMine, saveNumber;
	private String playerName, mineLocation;

	private int tools[], oresMined[], houseDecor[];
	private ArrayList<Mine> ownedMines;

	public int getSaveNumber() {
		return saveNumber;
	}

	public void setSaveNumber(int saveNumber) {
		this.saveNumber = saveNumber;
	}

	/**
	 * PlayerModel constructor
	 * 
	 * @param name Name of the player, represented as a String
	 */
	public PlayerModel(String name) {
		playerName = name; // save name
		playerHealth = 100; // starting health
		gold = 500; // starting gold for tools and such
		energy = 10; // starting energy, modified by house upgrades
		days = 0;

		houseDecor = new int[3]; // table, house, bed
		for (int i = 0; i < houseDecor.length; i++)
			houseDecor[i] = 1; // starter decor; rickety chair/table, wood shack, old bed

		tools = new int[3]; // pickaxe, armor, axe
		for (int i = 0; i < tools.length; i++)
			tools[i] = 1; // starter gear; rusty pickaxe, linen scarf, chipped axe

		oresMined = new int[5];
		for (int i = 0; i < oresMined.length; i++)
			oresMined[i] = 0;

		ownedMines = new ArrayList<Mine>();

		saveNumber = 0;
	}

	/**
	 * upgradeTools is called when a player is in the shop and they attempt to
	 * upgrade any one of their tools. depending on the current upgrade it will cost
	 * more to upgrade to the next tier
	 * 
	 * @param toolNumber    int of which tool is attempting to be upgraded. 0 =
	 *                      pickaxe, 1 = armor, 2 = axe.
	 * @param upgradeNumber int, used to see which upgrade the player currently has
	 *                      to see if they have gold for the next tier
	 * @return true or false, true if an upgrade was bought, false otherwise
	 */
	// could make it so that upgrades require certain ores
	public boolean upgradeTools(int toolNumber, int upgradeNumber) {
		switch (upgradeNumber) {
		case 1:
			if (gold >= 20) {
				tools[toolNumber]++;
				gold -= 20;
				return true;
			}
			break;
		case 2:
			if (gold >= 40) {
				tools[toolNumber]++;
				gold -= 40;
				return true;
			}
			break;
		case 3:
			if (gold >= 80) {
				tools[toolNumber]++;
				gold -= 80;
				return true;
			}
			break;
		case 4:
			if (gold >= 200) {
				tools[toolNumber]++;
				gold -= 200;
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * renovateHouse is called when a player is in the shop and they attempt to
	 * upgrade any one of their house decor. depending on the current upgrade it
	 * will cost more to upgrade to the next tier
	 * 
	 * @param houseItem     used to increment the item in the house upgrade tab
	 * @param upgradeNumber used to see which upgrade the player currently has to
	 *                      see if they have gold for the next tier
	 * @return true or false, true if an upgrade was bought, false otherwise
	 */
	public boolean renovateHouse(int houseItem, int upgradeNumber) {
		switch (upgradeNumber) {
		case 1:
			if (gold >= 40) {
				houseDecor[houseItem]++;
				gold -= 40;
				return true;
			}
			break;
		case 2:
			if (gold >= 100) {
				houseDecor[houseItem]++;
				gold -= 100;
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * addMine called when a player tries to buy a mine in the MineSelection fxml
	 * file
	 * 
	 * @param areaNumber int, number used to determine which plot the user selected
	 */
	public void addMine(int a, int b) {
		Mine newMine = new Mine(a, b);
		ownedMines.add(newMine);
	}

	/**
	 * buyMine is called when a player tries to buy a mine and checks to see if they
	 * have the amount of gold to buy
	 * 
	 * @param areaNumber int, plot they are trying to buy relative to the view
	 */
	public void buyMine(int areaNumber) { // requires gold
		switch (areaNumber) {
		case 1:
			if (gold >= 0) { // First Mine is free, Simple Small
				addMine(1, 1);
			}
			break;
		case 2:
			if (gold >= 150) { // Simple Medium
				addMine(1, 2);
				gold -= 150;
			}
			break;
		case 3:
			if (gold >= 250) { // Simple Large
				addMine(1, 3);
				gold -= 250;
			}
			break;
		case 4:
			if (gold >= 500) { // Simple Gargantuan
				addMine(1, 4);
				gold -= 500;
			}
			break;
		case 5:
			if (gold >= 200) { // Jungle Small
				addMine(2, 1);
				gold -= 200;
			}
			break;
		case 6:
			if (gold >= 300) { // Jungle Medium
				addMine(2, 2);
				gold -= 300;
			}
			break;
		case 7:
			if (gold >= 400) { // Jungle Large
				Mine newMine = new Mine(2, 3);
				ownedMines.add(newMine);
				gold -= 400;
			}
			break;
		case 8:
			if (gold >= 700) { // Jungle Gargantuan
				addMine(2, 4);
				gold -= 700;
			}
			break;
		case 9:
			if (gold >= 500) { // Ruins Small
				addMine(3, 1);
				gold -= 500;
			}
			break;
		case 10:
			if (gold >= 750) { // Ruins Medium
				addMine(3, 2);
				gold -= 750;
			}
			break;
		case 11:
			if (gold >= 1000) { // Ruins Large
				addMine(3, 3);
				gold -= 1000;
			}
			break;
		case 12:
			if (gold >= 1500) { // Ruins Gargantuan
				addMine(3, 4);
				gold -= 1500;
			}
			break;
		}
	}

	/**
	 * saveGame is called when a player tries to save the game in the Save.fxml file
	 * 
	 * @param saveNumber indicates which save file the player is trying to save to
	 */
	// take all the info and puts it into a save file
	public void saveGame(int saveNumber) {
		if (saveNumber != 0) {
			switch (saveNumber) {
			case 1:
				try {
					Writer fileWriter = new FileWriter("data/PlayerSave1.txt", false); // overwrites file
					fileWriter.write(this.playerName + "," + this.gold + "," + this.ownedMines.size());
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					Writer fileWriter = new FileWriter("data/PlayerSave2.txt", false); // overwrites file
					fileWriter.write(this.playerName + "," + this.gold + "," + this.ownedMines.size());
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					Writer fileWriter = new FileWriter("data/PlayerSave3.txt", false); // overwrites file
					fileWriter.write(this.playerName + "," + this.gold + "," + this.ownedMines.size());
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
		// ensures that there can be no more than 3 save files and code will be
		// implemented so that there will be an override option
		return;
		// this part of the code creates a file or adds onto empty, existing files
	}

	// getters and setters
	public int[] getOres() {
		return oresMined;
	}

	public void setOres(int[] ores) {
		this.oresMined = ores;
	}

	public int getPlayerHealth() {
		return playerHealth;
	}

	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}

	public int[] getTools() {
		return tools;
	}

	public int getSpecificTool(int specificTool) {
		return tools[specificTool];
	}

	public int getSpecificDecor(int specificDecor) {
		return houseDecor[specificDecor];
	}

	public void setTools(int[] tools) {
		this.tools = tools;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int[] getHouseDecor() {
		return houseDecor;
	}

	public void setHouseDecor(int[] houseDecor) {
		this.houseDecor = houseDecor;
	}

	public ArrayList<Mine> getOwnedMines() {
		return ownedMines;
	}

	public void setOwnedMines(ArrayList<Mine> ownedMines) {
		this.ownedMines = ownedMines;
	}

	public int getSelectedMine() {
		return selectedMine;
	}

	public void setSelectedMine(int selectedMine) {
		this.selectedMine = selectedMine;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setMineLocation(String location) {
		mineLocation = location;
	}

	public String getMineLocation() {
		return mineLocation;
	}
}