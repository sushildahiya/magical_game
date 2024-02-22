package com.player;

public class Battle {
	/**
	 * Battle Functionality to roll dices for both the players
	 * @param playerA
	 * @param playerB
	 * @param battleLog
	 */
	public void attackFunctionality(Player playerA, Player playerB,StringBuilder battleLog) {
		Player attacker;
		Player defender;
		if (playerA.getHealth() < playerB.getHealth()) {
			attacker = playerB;
			defender = playerA;
		}else {
			attacker = playerA;
			defender = playerB;
		}
		 while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
		        attacker = (attacker==playerA) ? playerB : playerA;
		        defender = (attacker == playerA) ? playerB : playerA;

		        int attackRoll = playerA.rollDice();
		        int defendRoll = playerB.rollDice();

		        int attackDamage = attackRoll * attacker.getAttack();
		        int defendStrength = defendRoll * defender.getStrength();

		        int damageTaken = Math.max(0, attackDamage - defendStrength);
		        defender.reduceHealth(damageTaken);

		       Battle.systemPrint(attacker, playerA, playerB, attackRoll, defender, defendRoll, attackDamage, defendStrength, battleLog);
		    }
		    if (playerA.getHealth() == 0) {
		        battleLog.append("Player B wins!");
		    } else {
		        battleLog.append("Player A wins!");
		    }

	}
	
	/**
	 * Functionality to print the battle in console and swing data console.
	 * @param attacker
	 * @param playerA
	 * @param playerB
	 * @param attackRoll
	 * @param defender
	 * @param defendRoll
	 * @param attackDamage
	 * @param defendStrength
	 * @param battleLog
	 */
	
	public static void systemPrint(Player attacker,Player playerA, Player playerB, int attackRoll,Player defender,int defendRoll,int attackDamage,int defendStrength,StringBuilder battleLog) {
		 battleLog.append((attacker==playerA) ? "Player A" : "Player B")
         .append(" attacks and rolls die: ").append(attackRoll)
         .append(". \n").append(defender==playerA ? "Player A" : "Player B")
         .append(" defends and rolls die: ").append(defendRoll)
         .append(". \n Attack damage: ").append(attackDamage)
         .append(" Defending strength: ").append(defendStrength)
         .append(" \n").append((attacker == playerA) ? "Player B" : "Player A")
         .append(" health : ").append(defender.getHealth())
         .append("\n \n");   
		 
		 System.out.println((attacker==playerA) ? "Player A" : "Player B"+" attacks and rolls die: "+attackRoll);
		 System.out.println(defender==playerA ? "Player A" : "Player B"+" defends and rolls die: "+defendRoll);
		 System.out.println("Attack damage: "+attackDamage+" Defending strength: "+defendStrength);
		 System.out.println((attacker == playerA) ? "Player B" : "Player A"+" health : "+defender.getHealth()+"\n");
	}
}
