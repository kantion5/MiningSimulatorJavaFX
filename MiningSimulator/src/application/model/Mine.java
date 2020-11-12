package application.model;

import java.util.*;

/**
 * Mine is used to represent the mine in the plots of different sizes. this
 * class contains an ArrayList of MineNodes
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 */
public class Mine {
	public ArrayList<MiningNode> nodeArray;
	int mineStyle; // Can be 1 - Simple, 2 - Jungle, or 3 - Dwarf Ruins
	int mineSize; // Can be 1 - Small, 2 - Medium, or 3 - Large
	int selectedNode;

	public Mine(int style, int size) {
		this.mineStyle = style;
		this.mineSize = size;
		this.nodeArray = new ArrayList<MiningNode>();
		switch (this.mineSize) {
		case 1:
			for (int i = 0; i < 5; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 1);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 5; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 2);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 5; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 3);
				if (this.mineStyle == 3 && i == 2)
					newNode.setBossNode(true);
				this.nodeArray.add(newNode);
			}
		case 2:
			for (int i = 0; i < 7; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 1);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 7; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 2);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 7; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 3);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 7; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 4);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 7; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 5);
				if (this.mineStyle == 3 && i == 3)
					newNode.setBossNode(true);
				this.nodeArray.add(newNode);
			}
		case 3:
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 1);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 2);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 3);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 4);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 5);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 6);
				this.nodeArray.add(newNode);
			}
			for (int i = 0; i < 9; i++) {
				MiningNode newNode = new MiningNode(this.mineStyle, 7);
				if (this.mineStyle == 3 && i == 4)
					newNode.setBossNode(true);
				this.nodeArray.add(newNode);
			}
		}
	}

	public ArrayList<MiningNode> getNodeArray() {
		return nodeArray;
	}

	public void setNodeArray(ArrayList<MiningNode> nodeArray) {
		this.nodeArray = nodeArray;
	}

	public int getMineStyle() {
		return mineStyle;
	}

	public void setMineStyle(int mineStyle) {
		this.mineStyle = mineStyle;
	}

	public int getMineSize() {
		return mineSize;
	}

	public void setMineSize(int mineSize) {
		this.mineSize = mineSize;
	}

	public int getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(int selectedNode) {
		this.selectedNode = selectedNode;
	}

}
