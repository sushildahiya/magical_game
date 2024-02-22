package com.player;

import com.runner.Runner;
import java.util.Random;

public class Player {
	private int health;
	private int strength;
	private int attack;
	
	/**
	 * Parameterized constructor of Player class
	 * @param health
	 * @param strength
	 * @param attack
	 */
	public Player(int health, int strength, int attack) {
		this.health=health;
		this.attack= attack;
		this.strength=strength;
	}
	
	/**
	 * Getter and setters for player class atrributes
	 * @return
	 */
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Method to check healtht and decrease the players health
	 * @param damage
	 */
	public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
	public int rollDice() {
        return new Random().nextInt(Runner.DICE_SIDES) + 1;
    }
}
