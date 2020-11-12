package application.controller;

import application.Main;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

/**
 * player is able to mine in the small mine
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class MiningPlotSmallController {

	@FXML
	Label energyLabel, mineStyleLabel;
	@FXML
	Button nodeButton1, nodeButton2, nodeButton3, nodeButton4, nodeButton5, nodeButton6, nodeButton7, nodeButton8,
			nodeButton9, nodeButton10, nodeButton11, nodeButton12, nodeButton13, nodeButton14, nodeButton15;
	@FXML
	Rectangle nodeRect1, nodeRect2, nodeRect3, nodeRect4, nodeRect5, nodeRect6, nodeRect7, nodeRect8, nodeRect9,
			nodeRect10, nodeRect11, nodeRect12, nodeRect13, nodeRect14, nodeRect15, grassRect1, grassRect2, grassRect3,
			grassRect4, grassRect5;

	/**
	 * initializes labels and buttons
	 */
	public void initialize() {
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));

		for (int i = 0; i < Main.player.getOwnedMines().size(); i++) {
			if (Main.player.getOwnedMines().get(i).getMineStyle() == 1
					&& Main.player.getOwnedMines().get(i).getMineSize() == 1 && Main.player.getSelectedMine() == 1) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Simple Small Mine");
				setVisibility();
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2
					&& Main.player.getOwnedMines().get(i).getMineSize() == 1 && Main.player.getSelectedMine() == 5) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Jungle Small Mine");
				setVisibility();
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3
					&& Main.player.getOwnedMines().get(i).getMineSize() == 1 && Main.player.getSelectedMine() == 9) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Ruins Small Mine");
				setVisibility();
			}
		}

		nodeButton1.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(0);
				}
			}
		});

		nodeButton2.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(1);
				}
			}
		});

		nodeButton3.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(2);
				}
			}
		});

		nodeButton4.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(3);
				}
			}
		});

		nodeButton5.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(4);
				}
			}
		});

		nodeButton6.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(5);
				}
			}
		});

		nodeButton7.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(6);
				}
			}
		});

		nodeButton8.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(7);
				}
			}
		});

		nodeButton9.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(8);
				}
			}
		});

		nodeButton10.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(9);
				}
			}
		});

		nodeButton11.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(10);
				}
			}
		});

		nodeButton12.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(11);
				}
			}
		});

		nodeButton13.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(12);
				}
			}
		});

		nodeButton14.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(13);
				}
			}
		});

		nodeButton15.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(14);
				}
			}
		});

	}

	/**
	 * setVisibility sets the opacity of mining nodes to 0 if they have been mined
	 * already
	 */
	public void setVisibility() {
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).isVisible() == false) {
			nodeButton1.setOpacity(0);
			grassRect1.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).isVisible() == false) {
			nodeButton2.setOpacity(0);
			grassRect2.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).isVisible() == false) {
			nodeButton3.setOpacity(0);
			grassRect3.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).isVisible() == false) {
			nodeButton4.setOpacity(0);
			grassRect4.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).isVisible() == false) {
			nodeButton5.setOpacity(0);
			grassRect5.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).isVisible() == false)
			nodeButton6.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).isVisible() == false)
			nodeButton7.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).isVisible() == false)
			nodeButton8.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).isVisible() == false)
			nodeButton9.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).isVisible() == false)
			nodeButton10.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).isVisible() == false)
			nodeButton11.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).isVisible() == false)
			nodeButton12.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).isVisible() == false)
			nodeButton13.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).isVisible() == false)
			nodeButton14.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).isVisible() == false)
			nodeButton15.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).isDug() == true) {
			nodeRect1.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).isDug() == true) {
			nodeRect2.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).isDug() == true) {
			nodeRect3.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).isDug() == true) {
			nodeRect4.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).isDug() == true) {
			nodeRect5.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).isDug() == true) {
			nodeRect6.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).isDug() == true) {
			nodeRect7.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).isDug() == true) {
			nodeRect8.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).isDug() == true) {
			nodeRect9.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).isDug() == true) {
			nodeRect10.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).isDug() == true) {
			nodeRect11.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).isDug() == true) {
			nodeRect12.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).isDug() == true) {
			nodeRect13.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).isDug() == true) {
			nodeRect14.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).isDug() == true) {
			nodeRect15.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0)
						.isDug() == false)
			nodeButton1.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1)
						.isDug() == false)
			nodeButton2.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2)
						.isDug() == false)
			nodeButton3.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3)
						.isDug() == false)
			nodeButton4.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4)
						.isDug() == false)
			nodeButton5.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5)
						.isDug() == false)
			nodeButton6.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6)
						.isDug() == false)
			nodeButton7.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7)
						.isDug() == false)
			nodeButton8.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8)
						.isDug() == false)
			nodeButton9.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9)
						.isDug() == false)
			nodeButton10.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10)
						.isDug() == false)
			nodeButton11.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11)
						.isDug() == false)
			nodeButton12.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12)
						.isDug() == false)
			nodeButton13.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13)
						.isDug() == false)
			nodeButton14.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14)
						.isDug() == false)
			nodeButton15.setOpacity(1);
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));
	}

	/**
	 * handle is called to return back to the home view
	 * 
	 * @param event
	 */
	public void handle(ActionEvent event) {
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handleFight is called to update the view when the player has a monster
	 * encounter
	 * 
	 * @param event
	 */
	@FXML
	void handleFight(ActionEvent event) {
		Main.loadNextView("../Fight.fxml");
	}

	/**
	 * handleDig is called when the dig button is pressed and the player tries to
	 * mine a node
	 * 
	 * @param event
	 */
	@FXML
	void handleDig(ActionEvent event) {
		/*
		 * Digs selected node, distributes loot, takes away energy, makes buttons/dirt
		 * patch invisible and unselectable revealing the darker rectangle underneath.
		 * Makes visible adjacent nodes to those dug.
		 */
		if (Main.player.getEnergy() >= 2) {
			Main.player.setEnergy(Main.player.getEnergy() - 2);
			if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 0) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).setVisible(false);
				nodeRect1.setOpacity(0);
				grassRect1.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(0));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 1) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).setVisible(false);
				nodeRect2.setOpacity(0);
				grassRect2.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(1));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 2) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).setVisible(false);
				nodeRect3.setOpacity(0);
				grassRect3.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 3) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).setVisible(false);
				nodeRect4.setOpacity(0);
				grassRect4.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 4) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).setVisible(false);
				nodeRect5.setOpacity(0);
				grassRect5.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 5) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(false);
				nodeRect6.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 6) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(false);
				nodeRect7.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 7) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(false);
				nodeRect8.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 8) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(false);
				nodeRect9.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 9) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(false);
				nodeRect10.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 10) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(false);
				nodeRect11.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 11) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(false);
				nodeRect12.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 12) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(false);
				nodeRect13.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 13) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(false);
				nodeRect14.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 14) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(false);
				nodeRect15.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				setVisibility();
			}
		} else {
		}

	}

}
