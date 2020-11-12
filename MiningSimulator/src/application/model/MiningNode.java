package application.model;

import java.util.concurrent.*;
import application.Main;

/**
 * MiningNode is used to represent nodes during mining and are used in Mine
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class MiningNode {
	boolean dug, visible, bossNode;
	int nodeType, nodeDepth, encounterChance;
	int ores[];

	public MiningNode(int type, int depth) {
		this.dug = false;
		this.visible = false;
		this.nodeType = type;
		this.nodeDepth = depth;
		this.encounterChance = 0;

		if (depth == 1)
			this.visible = true;
		ores = new int[5];
		// Copper, Iron, Silver, Gold, Mithril, respectively
		for (int i = 0; i < ores.length; i++)
			ores[i] = 0;

		rollLoot(this.nodeType, this.nodeDepth);
	}

	/**
	 * roolLoot gives random loot to the player based on what node they were mining
	 * and gives bonus ore based on their level of pickaxe
	 * 
	 * @param type
	 * @param depth int, the depth the player mined, increases chance for higher
	 *              ores
	 */
	public void rollLoot(int type, int depth) {
		int value = ThreadLocalRandom.current().nextInt(100);
		switch (depth) {
		case 1:
			if (value < 33) {
				value = ThreadLocalRandom.current().nextInt(5) + 1;
				ores[0] = value;
			}
		case 2:
			if (value < 40) {
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[0] = value;
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[1] = value;
			}
		case 3:
			if (value < 50) {
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[0] = value;
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[1] = value;
			}
		case 4:
			if (value < 50) {
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[1] = value;
				value = ThreadLocalRandom.current().nextInt(4) + 1 * Main.player.getSpecificTool(0);
				ores[2] = value;
			}
		case 5:
			if (value < 50) {
				value = ThreadLocalRandom.current().nextInt(6) + 1 * Main.player.getSpecificTool(0);
				ores[0] = value;
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[1] = value;
				value = ThreadLocalRandom.current().nextInt(4) + 1 * Main.player.getSpecificTool(0);
				ores[2] = value;
			}
		case 6:
			if (value < 50) {
				value = ThreadLocalRandom.current().nextInt(4) + 1 * Main.player.getSpecificTool(0);
				ores[1] = value;
				value = ThreadLocalRandom.current().nextInt(3) + 1 * Main.player.getSpecificTool(0);
				ores[2] = value;
				value = ThreadLocalRandom.current().nextInt(2) + 1 * Main.player.getSpecificTool(0);
				ores[3] = value;
				value = ThreadLocalRandom.current().nextInt(1) + 1 * Main.player.getSpecificTool(0);
				ores[4] = value;
			}
		case 7:
			if (value < 50) {
				value = ThreadLocalRandom.current().nextInt(5) + 1 * Main.player.getSpecificTool(0);
				ores[2] = value;
				value = ThreadLocalRandom.current().nextInt(4) + 1 * Main.player.getSpecificTool(0);
				ores[3] = value;
				value = ThreadLocalRandom.current().nextInt(3) + 1 * Main.player.getSpecificTool(0);
				ores[4] = value;
			}
		}
	}

	/**
	 * distributeLoot is called to set the ores for the player based on what was
	 * mined
	 * 
	 * @param currentNode
	 */
	public void distributeLoot(MiningNode currentNode) {
		int tempOres[] = new int[5];
		for (int i = 0; i < tempOres.length; i++)
			tempOres[i] = 0;
		// tempOres = Main.player.getOres();
		int nodeOres[] = this.getOres();
		for (int i = 0; i < 5; i++) {
			tempOres[i] += nodeOres[i];
		}
		Main.player.setOres(tempOres);
		this.setEncounterChance(ThreadLocalRandom.current().nextInt(100));
		if (this.isBossNode() == true) {
			Main.monster.setMonsterHp(150);
			this.setEncounterChance(1);
		}
		if (this.getEncounterChance() < 10) {
			Main.loadNextView("../Fight.fxml");
		}
	}

	public int getEncounterChance() {
		return encounterChance;
	}

	public void setEncounterChance(int encounterChance) {
		this.encounterChance = encounterChance;
	}

	public boolean isBossNode() {
		return bossNode;
	}

	public void setBossNode(boolean bossNode) {
		this.bossNode = bossNode;
	}

	public boolean isDug() {
		return dug;
	}

	public void setDug(boolean dug) {
		this.dug = dug;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getNodeType() {
		return nodeType;
	}

	public void setNodeType(int nodeType) {
		this.nodeType = nodeType;
	}

	public int getNodeDepth() {
		return nodeDepth;
	}

	public void setNodeDepth(int nodeDepth) {
		this.nodeDepth = nodeDepth;
	}

	public int[] getOres() {
		return ores;
	}

	public void setOres(int[] ores) {
		this.ores = ores;
	}
}