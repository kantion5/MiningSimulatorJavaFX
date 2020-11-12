package application.controller;

import application.Main;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.util.concurrent.*;

/**
 * makes the player able to fight against monsters
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class FightController {
	public static String locationOfMine;

	@FXML
	Label monsterHealth, playerHealth;
	@FXML
	ImageView slimeImageView, goblinImageView, golemImageView, beastImageView;

	/**
	 * initializes the health of the player and monster, and sets a monsters to be
	 * viewed
	 */
	public void initialize() {
		int playerHp = Main.player.getPlayerHealth();
		int playerBed = Main.player.getSpecificDecor(2);
		switch (playerBed) {
		case 2:
			playerHp += 20;
			break;
		case 3:
			playerHp += 50;
			break;
		}

		playerHealth.setText(Integer.toString(playerHp));
		monsterHealth.setText(Integer.toString(Main.monster.getMonsterHp()));
		locationOfMine = Main.player.getMineLocation();

		for (int i = 0; i < Main.player.getOwnedMines().size(); i++) {
			if (Main.player.getOwnedMines().get(i).getMineStyle() == 1) {
				slimeImageView.setOpacity(1);
				goblinImageView.setOpacity(0);
				golemImageView.setOpacity(0);
				beastImageView.setOpacity(0);
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2) {
				slimeImageView.setOpacity(0);
				goblinImageView.setOpacity(1);
				golemImageView.setOpacity(0);
				beastImageView.setOpacity(0);
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3) {
				slimeImageView.setOpacity(0);
				goblinImageView.setOpacity(0);
				golemImageView.setOpacity(1);
				beastImageView.setOpacity(0);
			}
			if (Main.monster.getMonsterHp() == 150) {
				slimeImageView.setOpacity(0);
				goblinImageView.setOpacity(0);
				golemImageView.setOpacity(0);
				beastImageView.setOpacity(1);
			}
		}
	}

	/**
	 * handleAttack is used when a player tries to attack a monster. this function
	 * uses formulas to calculate damage done to the monster and the player
	 * 
	 * @param event
	 */
	@FXML
	public void handleAttack(ActionEvent event) {
		String pH = playerHealth.getText();
		String mH = monsterHealth.getText();

		int playerHp = Integer.parseInt(pH);
		int monsterHp = Integer.parseInt(mH);
		int playerAxe = Main.player.getSpecificTool(2);
		int playerArmor = Main.player.getSpecificTool(1);

		// player's turn to attack
		switch (playerAxe) {
		case 1:
			monsterHp -= ThreadLocalRandom.current().nextInt(5, 10 + 1);
			break;
		case 2:
			monsterHp -= ThreadLocalRandom.current().nextInt(5, 15 + 1);
			break;
		case 3:
			monsterHp -= ThreadLocalRandom.current().nextInt(10, 15 + 1);
			break;
		case 4:
			monsterHp -= ThreadLocalRandom.current().nextInt(10, 20 + 1);
			break;
		case 5:
			monsterHp -= ThreadLocalRandom.current().nextInt(15, 25 + 1);
			break;
		}
		monsterHealth.setText(Integer.toString(monsterHp));

		// monster's turn to attack
		switch (playerArmor) {
		case 1:
			playerHp -= ThreadLocalRandom.current().nextInt(15 + 1);
			break;
		case 2:
			playerHp -= ThreadLocalRandom.current().nextInt(10, 15 + 1);
			break;
		case 3:
			playerHp -= ThreadLocalRandom.current().nextInt(5, 15 + 1);
			break;
		case 4:
			playerHp -= ThreadLocalRandom.current().nextInt(5, 10 + 1);
			break;
		case 5:
			playerHp -= ThreadLocalRandom.current().nextInt(5);
			break;
		}
		playerHealth.setText(Integer.toString(playerHp));

		// player loses gold if they are defeated by the monster
		if (playerHp <= 0) {
			youLose(event);
		} else if (monsterHp <= 0) {
			int loot = Main.monster.randomLoot() + Main.player.getGold();
			Main.player.setGold(loot);

			Main.loadNextView("../MineSelection.fxml");
		}
	}

	/**
	 * handleBlock is called when a player tries to block the monster by clicking
	 * the block button. the amount of damage is based on the armor value the player
	 * currently has
	 * 
	 * @param event
	 */
	@FXML
	public void handleBlock(ActionEvent event) {
		String pH = playerHealth.getText();
		int playerHp = Integer.parseInt(pH);
		int playerArmor = Main.player.getSpecificTool(1);

		// player's turn to defend / monster's to attack
		switch (playerArmor) {
		case 1:
			playerHp -= ThreadLocalRandom.current().nextInt(10 + 1);
			break;
		case 2:
			playerHp -= ThreadLocalRandom.current().nextInt(7, 10 + 1);
			break;
		case 3:
			playerHp -= ThreadLocalRandom.current().nextInt(5, 7 + 1);
			break;
		case 4:
			playerHp -= ThreadLocalRandom.current().nextInt(3, 5 + 1);
			break;
		case 5:
			playerHp -= ThreadLocalRandom.current().nextInt(2);
			break;
		}
		playerHealth.setText(Integer.toString(playerHp));

		// player loses gold if they are defeated by the monster
		if (playerHp <= 0)
			youLose(event);
	}

	/**
	 * handleRun is called when the player tries to run from the monster and changes
	 * the view to home
	 * 
	 * @param event
	 */
	@FXML
	public void handleRun(ActionEvent event) {
		if (Main.player.getEnergy() >= 2) {
			Main.player.setEnergy(Main.player.getEnergy() - 2);
			Main.loadNextView("../MineSelection.fxml");
		} else {
			Main.loadNextView("../Home.fxml");
		}
	}

	/**
	 * youLose is called when the player loses all their health
	 * 
	 * @param event
	 */
	private void youLose(ActionEvent event) {
		int goldNow = Main.player.getGold();
		int goldLost = 10 * ThreadLocalRandom.current().nextInt(1, 10 + 1);

		if (goldNow <= 50)
			Main.player.setGold(0);
		else {
			Main.player.setGold(goldNow - goldLost);
		}
		handleRun(event);
	}

}
