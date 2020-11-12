package application.controller;

import application.Main;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

/**
 * player is able to mine in the medium mine
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class MiningPlotMediumController {

	@FXML
	Label energyLabel, mineStyleLabel;
	@FXML
	Button nodeButton1, nodeButton2, nodeButton3, nodeButton4, nodeButton5, nodeButton6, nodeButton7, nodeButton8,
			nodeButton9, nodeButton10, nodeButton11, nodeButton12, nodeButton13, nodeButton14, nodeButton15,
			nodeButton16, nodeButton17, nodeButton18, nodeButton19, nodeButton20, nodeButton21, nodeButton22,
			nodeButton23, nodeButton24, nodeButton25, nodeButton26, nodeButton27, nodeButton28, nodeButton29,
			nodeButton30, nodeButton31, nodeButton32, nodeButton33, nodeButton34, nodeButton35, nodeButton36,
			nodeButton37, nodeButton38, nodeButton39, nodeButton40, nodeButton41, nodeButton42;
	@FXML
	Rectangle nodeRect1, nodeRect2, nodeRect3, nodeRect4, nodeRect5, nodeRect6, nodeRect7, nodeRect8, nodeRect9,
			nodeRect10, nodeRect11, nodeRect12, nodeRect13, nodeRect14, nodeRect15, nodeRect16, nodeRect17, nodeRect18,
			nodeRect19, nodeRect20, nodeRect21, nodeRect22, nodeRect23, nodeRect24, nodeRect25, nodeRect26, nodeRect27,
			nodeRect28, nodeRect29, nodeRect30, nodeRect31, nodeRect32, nodeRect33, nodeRect34, nodeRect35, nodeRect36,
			nodeRect37, nodeRect38, nodeRect39, nodeRect40, nodeRect41, nodeRect42, grassRect1, grassRect2, grassRect3,
			grassRect4, grassRect5, grassRect6, grassRect7;

	/**
	 * initializes labels and buttons
	 */
	public void initialize() {
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));

		for (int i = 0; i < Main.player.getOwnedMines().size(); i++) {
			if (Main.player.getOwnedMines().get(i).getMineStyle() == 1
					&& Main.player.getOwnedMines().get(i).getMineSize() == 2 && Main.player.getSelectedMine() == 2) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Simple Medium Mine");
				setVisibility();
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2
					&& Main.player.getOwnedMines().get(i).getMineSize() == 2 && Main.player.getSelectedMine() == 6) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Jungle Medium Mine");
				setVisibility();
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3
					&& Main.player.getOwnedMines().get(i).getMineSize() == 2 && Main.player.getSelectedMine() == 10) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Ruins Medium Mine");
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

		nodeButton16.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(15);
				}
			}
		});

		nodeButton17.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(16);
				}
			}
		});

		nodeButton18.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(17);
				}
			}
		});

		nodeButton19.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(18);
				}
			}
		});

		nodeButton20.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(19);
				}
			}
		});

		nodeButton21.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(20);
				}
			}
		});

		nodeButton22.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(21);
				}
			}
		});

		nodeButton23.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(22);
				}
			}
		});

		nodeButton24.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(23);
				}
			}
		});

		nodeButton25.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(24);
				}
			}
		});

		nodeButton26.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(25);
				}
			}
		});

		nodeButton27.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(26);
				}
			}
		});

		nodeButton28.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(27);
				}
			}
		});

		nodeButton29.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(28);
				}
			}
		});

		nodeButton30.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(29);
				}
			}
		});

		nodeButton31.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(30);
				}
			}
		});

		nodeButton32.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(31);
				}
			}
		});

		nodeButton33.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(32);
				}
			}
		});

		nodeButton34.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(33);
				}
			}
		});

		nodeButton35.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(34);
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).isVisible() == false) {
			nodeButton6.setOpacity(0);
			grassRect6.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).isVisible() == false) {
			nodeButton7.setOpacity(0);
			grassRect7.setOpacity(0);
		}
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).isVisible() == false)
			nodeButton16.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).isVisible() == false)
			nodeButton17.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).isVisible() == false)
			nodeButton18.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).isVisible() == false)
			nodeButton19.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).isVisible() == false)
			nodeButton20.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).isVisible() == false)
			nodeButton21.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).isVisible() == false)
			nodeButton22.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).isVisible() == false)
			nodeButton23.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).isVisible() == false)
			nodeButton24.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).isVisible() == false)
			nodeButton25.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).isVisible() == false)
			nodeButton26.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).isVisible() == false)
			nodeButton27.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).isVisible() == false)
			nodeButton28.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).isVisible() == false)
			nodeButton29.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).isVisible() == false)
			nodeButton30.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).isVisible() == false)
			nodeButton31.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).isVisible() == false)
			nodeButton32.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).isVisible() == false)
			nodeButton33.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).isVisible() == false)
			nodeButton34.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).isVisible() == false)
			nodeButton35.setOpacity(0);
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).isDug() == true) {
			nodeRect16.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).isDug() == true) {
			nodeRect17.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).isDug() == true) {
			nodeRect18.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).isDug() == true) {
			nodeRect19.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).isDug() == true) {
			nodeRect20.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).isDug() == true) {
			nodeRect21.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).isDug() == true) {
			nodeRect22.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).isDug() == true) {
			nodeRect23.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).isDug() == true) {
			nodeRect24.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).isDug() == true) {
			nodeRect25.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).isDug() == true) {
			nodeRect26.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).isDug() == true) {
			nodeRect27.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).isDug() == true) {
			nodeRect28.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).isDug() == true) {
			nodeRect29.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).isDug() == true) {
			nodeRect30.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).isDug() == true) {
			nodeRect31.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).isDug() == true) {
			nodeRect32.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).isDug() == true) {
			nodeRect33.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).isDug() == true) {
			nodeRect34.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).isDug() == true) {
			nodeRect35.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setVisible(false);
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15)
						.isDug() == false)
			nodeButton16.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16)
						.isDug() == false)
			nodeButton17.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17)
						.isDug() == false)
			nodeButton18.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18)
						.isDug() == false)
			nodeButton19.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19)
						.isDug() == false)
			nodeButton20.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20)
						.isDug() == false)
			nodeButton21.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21)
						.isDug() == false)
			nodeButton22.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22)
						.isDug() == false)
			nodeButton23.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23)
						.isDug() == false)
			nodeButton24.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24)
						.isDug() == false)
			nodeButton25.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25)
						.isDug() == false)
			nodeButton26.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26)
						.isDug() == false)
			nodeButton27.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27)
						.isDug() == false)
			nodeButton28.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28)
						.isDug() == false)
			nodeButton29.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29)
						.isDug() == false)
			nodeButton30.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30)
						.isDug() == false)
			nodeButton31.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31)
						.isDug() == false)
			nodeButton32.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32)
						.isDug() == false)
			nodeButton33.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33)
						.isDug() == false)
			nodeButton34.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34)
						.isDug() == false)
			nodeButton35.setOpacity(1);
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));
	}

	/**
	 * handle will return the player back to the home view when the button is
	 * pressed
	 * 
	 * @param event
	 */
	public void handle(ActionEvent event) {
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handleFight will be called when the player encounters a monster and updates
	 * the view
	 * 
	 * @param event
	 */
	@FXML
	void handleFight(ActionEvent event) {
		Main.loadNextView("../Fight.fxml");
	}

	/**
	 * handleDig is called when the player attempts to mine a node and updates
	 * player stats if a node is mined
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 5) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(false);
				nodeRect6.setOpacity(0);
				grassRect6.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 6) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(false);
				nodeRect7.setOpacity(0);
				grassRect7.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 7) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(false);
				nodeRect8.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 10) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(false);
				nodeRect11.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 14) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(false);
				nodeRect15.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 15) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(false);
				nodeRect16.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 16) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(false);
				nodeRect17.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 17) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(false);
				nodeRect18.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 18) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(false);
				nodeRect19.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 19) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(false);
				nodeRect20.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 20) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(false);
				nodeRect21.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 21) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(false);
				nodeRect22.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 22) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(false);
				nodeRect23.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 23) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(false);
				nodeRect24.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 24) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(false);
				nodeRect25.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 25) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(false);
				nodeRect26.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 26) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(false);
				nodeRect27.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 27) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(false);
				nodeRect28.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 28) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(false);
				nodeRect29.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 29) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(false);
				nodeRect30.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 30) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(false);
				nodeRect31.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 31) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(false);
				nodeRect32.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 32) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(false);
				nodeRect33.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 33) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(false);
				nodeRect34.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 34) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setVisible(false);
				nodeRect35.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(true);
				setVisibility();
			}
		} else {
		}

	}

}
