package application.controller;

import application.Main;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

/**
 * player is able to mine in the large mine
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class MiningPlotLargeController {

	@FXML
	Label energyLabel, mineStyleLabel;
	@FXML
	Button nodeButton1, nodeButton2, nodeButton3, nodeButton4, nodeButton5, nodeButton6, nodeButton7, nodeButton8,
			nodeButton9, nodeButton10, nodeButton11, nodeButton12, nodeButton13, nodeButton14, nodeButton15,
			nodeButton16, nodeButton17, nodeButton18, nodeButton19, nodeButton20, nodeButton21, nodeButton22,
			nodeButton23, nodeButton24, nodeButton25, nodeButton26, nodeButton27, nodeButton28, nodeButton29,
			nodeButton30, nodeButton31, nodeButton32, nodeButton33, nodeButton34, nodeButton35, nodeButton36,
			nodeButton37, nodeButton38, nodeButton39, nodeButton40, nodeButton41, nodeButton42, nodeButton43,
			nodeButton44, nodeButton45, nodeButton46, nodeButton47, nodeButton48, nodeButton49, nodeButton50,
			nodeButton51, nodeButton52, nodeButton53, nodeButton54, nodeButton55, nodeButton56, nodeButton57,
			nodeButton58, nodeButton59, nodeButton60, nodeButton61, nodeButton62, nodeButton63;
	@FXML
	Rectangle nodeRect1, nodeRect2, nodeRect3, nodeRect4, nodeRect5, nodeRect6, nodeRect7, nodeRect8, nodeRect9,
			nodeRect10, nodeRect11, nodeRect12, nodeRect13, nodeRect14, nodeRect15, nodeRect16, nodeRect17, nodeRect18,
			nodeRect19, nodeRect20, nodeRect21, nodeRect22, nodeRect23, nodeRect24, nodeRect25, nodeRect26, nodeRect27,
			nodeRect28, nodeRect29, nodeRect30, nodeRect31, nodeRect32, nodeRect33, nodeRect34, nodeRect35, nodeRect36,
			nodeRect37, nodeRect38, nodeRect39, nodeRect40, nodeRect41, nodeRect42, nodeRect43, nodeRect44, nodeRect45,
			nodeRect46, nodeRect47, nodeRect48, nodeRect49, nodeRect50, nodeRect51, nodeRect52, nodeRect53, nodeRect54,
			nodeRect55, nodeRect56, nodeRect57, nodeRect58, nodeRect59, nodeRect60, nodeRect61, nodeRect62, nodeRect63,
			grassRect1, grassRect2, grassRect3, grassRect4, grassRect5, grassRect6, grassRect7, grassRect8, grassRect9;

	/**
	 * initializes labels and buttons
	 */
	public void initialize() {
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));

		for (int i = 0; i < Main.player.getOwnedMines().size(); i++) {
			if (Main.player.getOwnedMines().get(i).getMineStyle() == 1
					&& Main.player.getOwnedMines().get(i).getMineSize() == 3 && Main.player.getSelectedMine() == 3) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Simple Large Mine");
				setVisibility();
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 2
					&& Main.player.getOwnedMines().get(i).getMineSize() == 3 && Main.player.getSelectedMine() == 7) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Jungle Large Mine");
				setVisibility();
			} else if (Main.player.getOwnedMines().get(i).getMineStyle() == 3
					&& Main.player.getOwnedMines().get(i).getMineSize() == 3 && Main.player.getSelectedMine() == 11) {
				Main.player.setSelectedMine(i);
				mineStyleLabel.setText("Ruins Large Mine");
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

		nodeButton36.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(35);
				}
			}
		});

		nodeButton37.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(36);
				}
			}
		});

		nodeButton38.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(37);
				}
			}
		});

		nodeButton39.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(0);
				}
			}
		});

		nodeButton40.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(39);
				}
			}
		});

		nodeButton41.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(40);
				}
			}
		});

		nodeButton42.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(41);
				}
			}
		});

		nodeButton43.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(42);
				}
			}
		});

		nodeButton44.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(43);
				}
			}
		});

		nodeButton45.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(44);
				}
			}
		});

		nodeButton46.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(45);
				}
			}
		});

		nodeButton47.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(46);
				}
			}
		});

		nodeButton48.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(47);
				}
			}
		});

		nodeButton49.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(48);
				}
			}
		});

		nodeButton50.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(49);
				}
			}
		});

		nodeButton51.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(50);
				}
			}
		});

		nodeButton52.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(51);
				}
			}
		});

		nodeButton53.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(52);
				}
			}
		});

		nodeButton54.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(53);
				}
			}
		});

		nodeButton55.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(54);
				}
			}
		});

		nodeButton56.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(55);
				}
			}
		});

		nodeButton57.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(56);
				}
			}
		});

		nodeButton58.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(57);
				}
			}
		});

		nodeButton59.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(58);
				}
			}
		});

		nodeButton60.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(59);
				}
			}
		});

		nodeButton61.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(60);
				}
			}
		});

		nodeButton62.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(61);
				}
			}
		});

		nodeButton63.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62)
						.isVisible() == true) {
					Main.player.getOwnedMines().get(Main.player.getSelectedMine()).setSelectedNode(62);
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).isVisible() == false) {
			nodeButton8.setOpacity(0);
			grassRect8.setOpacity(0);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).isVisible() == false) {
			nodeButton9.setOpacity(0);
			grassRect9.setOpacity(0);
		}
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).isVisible() == false)
			nodeButton36.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).isVisible() == false)
			nodeButton37.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).isVisible() == false)
			nodeButton38.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).isVisible() == false)
			nodeButton39.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).isVisible() == false)
			nodeButton40.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).isVisible() == false)
			nodeButton41.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).isVisible() == false)
			nodeButton42.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).isVisible() == false)
			nodeButton43.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).isVisible() == false)
			nodeButton44.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).isVisible() == false)
			nodeButton45.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).isVisible() == false)
			nodeButton46.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).isVisible() == false)
			nodeButton47.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).isVisible() == false)
			nodeButton48.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).isVisible() == false)
			nodeButton49.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).isVisible() == false)
			nodeButton50.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).isVisible() == false)
			nodeButton51.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).isVisible() == false)
			nodeButton52.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).isVisible() == false)
			nodeButton53.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).isVisible() == false)
			nodeButton54.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).isVisible() == false)
			nodeButton55.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).isVisible() == false)
			nodeButton56.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).isVisible() == false)
			nodeButton57.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).isVisible() == false)
			nodeButton58.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).isVisible() == false)
			nodeButton59.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).isVisible() == false)
			nodeButton60.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).isVisible() == false)
			nodeButton61.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).isVisible() == false)
			nodeButton62.setOpacity(0);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).isVisible() == false)
			nodeButton63.setOpacity(0);
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).isDug() == true) {
			nodeRect36.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).isDug() == true) {
			nodeRect37.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).isDug() == true) {
			nodeRect38.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).isDug() == true) {
			nodeRect39.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).isDug() == true) {
			nodeRect40.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).isDug() == true) {
			nodeRect41.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).isDug() == true) {
			nodeRect42.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).isDug() == true) {
			nodeRect43.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).isDug() == true) {
			nodeRect44.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).isDug() == true) {
			nodeRect45.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).isDug() == true) {
			nodeRect46.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).isDug() == true) {
			nodeRect47.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).isDug() == true) {
			nodeRect48.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).isDug() == true) {
			nodeRect49.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).isDug() == true) {
			nodeRect50.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).isDug() == true) {
			nodeRect51.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).isDug() == true) {
			nodeRect52.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).isDug() == true) {
			nodeRect53.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).isDug() == true) {
			nodeRect54.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).isDug() == true) {
			nodeRect55.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).isDug() == true) {
			nodeRect56.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).isDug() == true) {
			nodeRect57.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).isDug() == true) {
			nodeRect58.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).isDug() == true) {
			nodeRect59.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).isDug() == true) {
			nodeRect60.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).isDug() == true) {
			nodeRect61.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).isDug() == true) {
			nodeRect62.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).setVisible(false);
		}
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).isDug() == true) {
			nodeRect63.setOpacity(0);
			Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).setVisible(false);
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
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35)
						.isDug() == false)
			nodeButton36.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36)
						.isDug() == false)
			nodeButton37.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37)
						.isDug() == false)
			nodeButton38.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38)
						.isDug() == false)
			nodeButton39.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39)
						.isDug() == false)
			nodeButton40.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40)
						.isDug() == false)
			nodeButton41.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41)
						.isDug() == false)
			nodeButton42.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42)
						.isDug() == false)
			nodeButton43.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43)
						.isDug() == false)
			nodeButton44.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44)
						.isDug() == false)
			nodeButton45.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45)
						.isDug() == false)
			nodeButton46.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46)
						.isDug() == false)
			nodeButton47.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47)
						.isDug() == false)
			nodeButton48.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48)
						.isDug() == false)
			nodeButton49.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49)
						.isDug() == false)
			nodeButton50.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50)
						.isDug() == false)
			nodeButton51.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51)
						.isDug() == false)
			nodeButton52.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52)
						.isDug() == false)
			nodeButton53.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53)
						.isDug() == false)
			nodeButton54.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54)
						.isDug() == false)
			nodeButton55.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55)
						.isDug() == false)
			nodeButton56.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56)
						.isDug() == false)
			nodeButton57.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57)
						.isDug() == false)
			nodeButton58.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58)
						.isDug() == false)
			nodeButton59.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59)
						.isDug() == false)
			nodeButton60.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60)
						.isDug() == false)
			nodeButton61.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61)
						.isDug() == false)
			nodeButton62.setOpacity(1);
		if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).isVisible() == true
				&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62)
						.isDug() == false)
			nodeButton63.setOpacity(1);
		energyLabel.setText(Integer.toString(Main.player.getEnergy()));
	}

	/**
	 * handle is called when the home button is selected and updates the view
	 * 
	 * @param event
	 */
	public void handle(ActionEvent event) {
		Main.loadNextView("../Home.fxml");
	}

	/**
	 * handleFight is called when the Player encounters a Monster during mining
	 * 
	 * @param event
	 */
	@FXML
	void handleFight(ActionEvent event) {
		Main.loadNextView("../Fight.fxml");
	}

	/**
	 * handleDig is called when a player tries to mine a node and updates their
	 * stats if they do
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 2) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).setVisible(false);
				nodeRect3.setOpacity(0);
				grassRect3.setOpacity(2);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(2));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 3) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).setVisible(false);
				nodeRect4.setOpacity(0);
				grassRect4.setOpacity(3);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(3));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 4) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).setVisible(false);
				nodeRect5.setOpacity(0);
				grassRect5.setOpacity(4);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(4));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 5) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).setVisible(false);
				nodeRect6.setOpacity(0);
				grassRect6.setOpacity(5);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(5));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 6) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).setVisible(false);
				nodeRect7.setOpacity(0);
				grassRect7.setOpacity(6);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(6));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 7) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).setVisible(false);
				nodeRect8.setOpacity(0);
				grassRect8.setOpacity(7);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(7));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 8) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).setVisible(false);
				nodeRect9.setOpacity(0);
				grassRect9.setOpacity(8);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(8));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 9) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).setVisible(false);
				nodeRect10.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(9));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 18) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(false);
				nodeRect19.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(10).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(11).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 21) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(false);
				nodeRect22.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(12).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(13).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(14).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(15).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(16).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(17).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 27) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(false);
				nodeRect28.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(18).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 28) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(false);
				nodeRect29.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(19).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(20).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(21).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(22).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(23).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(24).setVisible(true);
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
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(25).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 35) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).setVisible(false);
				nodeRect36.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(26).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 36) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).setVisible(false);
				nodeRect37.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(27).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 37) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setVisible(false);
				nodeRect38.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(28).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 38) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setVisible(false);
				nodeRect39.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(29).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 39) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setVisible(false);
				nodeRect40.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(30).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 40) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setVisible(false);
				nodeRect41.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(31).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 41) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setVisible(false);
				nodeRect42.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(32).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 42) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setVisible(false);
				nodeRect43.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(33).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 43) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setVisible(false);
				nodeRect44.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(34).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 44) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).setVisible(false);
				nodeRect45.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(35).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 45) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).setVisible(false);
				nodeRect46.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(36).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 46) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setVisible(false);
				nodeRect47.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(37).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 47) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setVisible(false);
				nodeRect48.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(38).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 48) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setVisible(false);
				nodeRect49.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(39).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 49) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setVisible(false);
				nodeRect50.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(40).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 50) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setVisible(false);
				nodeRect51.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(41).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 51) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setVisible(false);
				nodeRect52.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(42).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 52) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setVisible(false);
				nodeRect53.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(43).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 53) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).setVisible(false);
				nodeRect54.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(44).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 54) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).setVisible(false);
				nodeRect55.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(45).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 55) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).setVisible(false);
				nodeRect56.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(54).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(46).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 56) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).setVisible(false);
				nodeRect57.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(55).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(47).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 57) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).setVisible(false);
				nodeRect58.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(56).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(48).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 58) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).setVisible(false);
				nodeRect59.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(57).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(49).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 59) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).setVisible(false);
				nodeRect60.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(58).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(50).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 60) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).setVisible(false);
				nodeRect61.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(59).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(51).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 61) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).setVisible(false);
				nodeRect62.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(60).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(52).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).setVisible(true);
				setVisibility();
			} else if (Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62)
					.isDug() == false
					&& Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getSelectedNode() == 62) {
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).setDug(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).setVisible(false);
				nodeRect63.setOpacity(0);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62).distributeLoot(
						Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(62));
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(61).setVisible(true);
				Main.player.getOwnedMines().get(Main.player.getSelectedMine()).getNodeArray().get(53).setVisible(true);
				setVisibility();
			}

		} else {
		}

	}

}
