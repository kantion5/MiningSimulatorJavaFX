package application.model;

import java.util.concurrent.*;

/**
 * MonsterModel is used to represent the Monster during an encounter.
 * 
 * @author Raymond Jackson
 * @author Isaac Gutierrez
 * @author Andrew Min
 * @author Jacob DeHoyos
 *
 */
public class MonsterModel {
	private int monsterHealth;

	public MonsterModel() {
		monsterHealth = 100;
	}

	public int randomLoot() {
		// at minimum player gets 50 gold and at max player gets 500
		return 10 * ThreadLocalRandom.current().nextInt(5, 50 + 1);
	}

	public int getMonsterHp() {
		return monsterHealth;
	}

	public void setMonsterHp(int health) {
		monsterHealth = health;
	}

	/**
	 * damageMonster is called during the battle with a monster
	 * 
	 * @param damage based on upgrades of the player
	 * @return the new monster health after an attack
	 */
	public int damageMonster(int damage) {
		monsterHealth -= damage;
		return monsterHealth;
	}

}
