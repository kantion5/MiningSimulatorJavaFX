package application.controller;

import application.Main;
import application.model.Mine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

/**
 * makes the player able to buy and enter mines
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class MineSelectController {

	@FXML
	Label goldLabel, mineLabel1, mineLabel2, mineLabel3, mineLabel4, mineLabel5, mineLabel6, mineLabel7, mineLabel8,
			mineLabel9, mineLabel10, mineLabel11, mineLabel12;
	@FXML
	Rectangle signRect1, signRect2, signRect3, signRect4, signRect5, signRect6, signRect7, signRect8, signRect9,
			signRect10, signRect11, signRect12;
	@FXML
	Button mineButton1, mineButton2, mineButton3, mineButton4, mineButton5, mineButton6, mineButton7, mineButton8,
			mineButton9, mineButton10, mineButton11, mineButton12;

	int selectedMine = 0;

	/**
	 * sets all the buttons on the mineSelect screen in order to make them
	 * functional
	 */
	public void initialize() {
		for (int i = 0; i < Main.player.getOwnedMines().size(); i++) {
			if (Main.player.getOwnedMines().get(i).getMineStyle() == 1
					&& Main.player.getOwnedMines().get(i).getMineSize() == 1)
				mineLabel1.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 1
					&& Main.player.getOwnedMines().get(i).getMineSize() == 2)
				mineLabel2.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 1
					&& Main.player.getOwnedMines().get(i).getMineSize() == 3)
				mineLabel3.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2
					&& Main.player.getOwnedMines().get(i).getMineSize() == 1)
				mineLabel5.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2
					&& Main.player.getOwnedMines().get(i).getMineSize() == 2)
				mineLabel6.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2
					&& Main.player.getOwnedMines().get(i).getMineSize() == 3)
				mineLabel7.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3
					&& Main.player.getOwnedMines().get(i).getMineSize() == 1)
				mineLabel9.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3
					&& Main.player.getOwnedMines().get(i).getMineSize() == 2)
				mineLabel10.setText("Bought!");
			else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3
					&& Main.player.getOwnedMines().get(i).getMineSize() == 3)
				mineLabel11.setText("Bought!");
		}

		goldLabel.setText(Integer.toString(Main.player.getGold()));

		mineButton1.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #eb8970;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 1;
			}
		});

		mineButton2.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #eb8970;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 2;
			}
		});

		mineButton3.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #eb8970;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 3;
			}
		});

		mineButton5.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #eb8970;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 5;
			}
		});

		mineButton6.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #eb8970;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 6;
			}
		});

		mineButton7.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #eb8970;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 7;
			}
		});

		mineButton9.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #eb8970;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 9;
			}
		});

		mineButton10.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #eb8970;");
				signRect11.setStyle("-fx-fill: #946154;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 10;
			}
		});

		mineButton11.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				signRect1.setStyle("-fx-fill: #946154;");
				signRect2.setStyle("-fx-fill: #946154;");
				signRect3.setStyle("-fx-fill: #946154;"); // signRect4.setStyle("-fx-fill: #946154;");
				signRect5.setStyle("-fx-fill: #946154;");
				signRect6.setStyle("-fx-fill: #946154;");
				signRect7.setStyle("-fx-fill: #946154;"); // signRect8.setStyle("-fx-fill: #946154;");
				signRect9.setStyle("-fx-fill: #946154;");
				signRect10.setStyle("-fx-fill: #946154;");
				signRect11.setStyle("-fx-fill: #eb8970;"); // signRect12.setStyle("-fx-fill: #946154;");
				selectedMine = 11;
			}
		});

	}

	/**
	 * handle is called when the player tries to return to the home view
	 * 
	 * @param event
	 */
	public void handle(ActionEvent event) {
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handleMine is called when the player tries to buy a plot and loads the next
	 * view depending on the purchase
	 * 
	 * @param event
	 */
	@FXML
	void handleMine(ActionEvent event) {
		if ((selectedMine == 1 && mineLabel1.getText().equals("Bought!"))
				|| (selectedMine == 5 && mineLabel5.getText().equals("Bought!"))
				|| (selectedMine == 9 && mineLabel9.getText().equals("Bought!"))) {
			Main.player.setSelectedMine(selectedMine);
			Main.player.setMineLocation("../MiningPlotSmall.fxml");
			Main.loadNextView("../MiningPlotSmall.fxml");
		} else if ((selectedMine == 2 && mineLabel2.getText().equals("Bought!"))
				|| (selectedMine == 6 && mineLabel6.getText().equals("Bought!"))
				|| (selectedMine == 10 && mineLabel10.getText().equals("Bought!"))) {
			Main.player.setSelectedMine(selectedMine);
			Main.player.setMineLocation("../MiningPlotMedium.fxml");
			Main.loadNextView("../MiningPlotMedium.fxml");
		} else if ((selectedMine == 3 && mineLabel3.getText().equals("Bought!"))
				|| (selectedMine == 7 && mineLabel7.getText().equals("Bought!"))
				|| (selectedMine == 11 && mineLabel11.getText().equals("Bought!"))) {
			Main.player.setSelectedMine(selectedMine);
			Main.player.setMineLocation("../MiningPlotLarge.fxml");
			Main.loadNextView("../MiningPlotLarge.fxml");
		}
	}

	/**
	 * handlePurchase is called when a player tries to purchase a plot and it checks
	 * to see if they have to money
	 * 
	 * @param event
	 */
	@FXML
	void handlePurchase(ActionEvent event) {
		switch (selectedMine) {
		case 1:
			if (Main.player.getGold() >= 0 && mineLabel1.getText().equals("Bought!") == false) {
				transaction(1, 1, 0);
				mineLabel1.setText("Bought!");
			}
			break;
		case 2:
			if (Main.player.getGold() >= 150 && mineLabel2.getText().equals("Bought!") == false) {
				transaction(1, 2, 150);
				mineLabel2.setText("Bought!");
			}
			break;
		case 3:
			if (Main.player.getGold() >= 250 && mineLabel3.getText().equals("Bought!") == false) {
				transaction(1, 3, 250);
				mineLabel3.setText("Bought!");
			}
			break;
		case 5:
			if (Main.player.getGold() >= 200 && mineLabel5.getText().equals("Bought!") == false) {
				transaction(2, 1, 200);
				mineLabel5.setText("Bought!");
			}
			break;
		case 6:
			if (Main.player.getGold() >= 300 && mineLabel6.getText().equals("Bought!") == false) {
				transaction(2, 2, 300);
				mineLabel6.setText("Bought!");
			}
			break;
		case 7:
			if (Main.player.getGold() >= 400 && mineLabel7.getText().equals("Bought!") == false) {
				transaction(2, 3, 400);
				mineLabel7.setText("Bought!");
			}
			break;
		case 9:
			if (Main.player.getGold() >= 500 && mineLabel9.getText().equals("Bought!") == false) {
				transaction(3, 1, 500);
				mineLabel9.setText("Bought!");
			}
			break;
		case 10:
			if (Main.player.getGold() >= 750 && mineLabel10.getText().equals("Bought!") == false) {
				transaction(3, 2, 750);
				mineLabel10.setText("Bought!");
			}
			break;
		case 11:
			if (Main.player.getGold() >= 1000 && mineLabel11.getText().equals("Bought!") == false) {
				transaction(3, 3, 1000);
				mineLabel11.setText("Bought!");
			}
			break;
		}
	}

	private void transaction(int a, int b, int gold) {
		Mine newMine = new Mine(a, b);
		Main.player.getOwnedMines().add(newMine);
		Main.player.setGold(Main.player.getGold() - gold);
		goldLabel.setText(Integer.toString(Main.player.getGold()));
	}

}
