package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnakeNLadder {
	final static int WINPOINT = 100;
	static Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	static Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
	
	{
		snake.put(99,54);
		snake.put(70,55);
		snake.put(52,42);
		snake.put(27,2);
		snake.put(95,72);
		
		ladder.put(6,25);
		ladder.put(11,40);
		ladder.put(60,85);
		ladder.put(46,90);
		ladder.put(17,69);
	}

/*
 * UC1 : snake and ladder game played with single player at start position 0
 * UC2 : the player roll the die to get number between 1 to 6
 */
	public void startGame() {
		int player1 =0;
		System.out.println("Start Position Of Player1: "+player1);
		Scanner sc = new Scanner(System.in);
		String str;
		int diceValue =0,count = 0;
        do {
            count ++;        	
        System.out.println("Press r to roll Dice");
		str = sc.next();
		System.out.println("rolls the dice to get number");
         diceValue=1+(int)Math.floor(Math.random()*6);
         System.out.println(" number on dice " +diceValue);
		player1 = calculatePlayerValue(player1,diceValue);
		System.out.println("First Player :: " + player1);
		System.out.println("------------------");
		if(isWin(player1))
		{
			System.out.println(" player wins");
		    System.out.println("Player won the game by " + count + " time throwing the dice");
			return;
		}

        }while("r".equals(str));
		}
/*
 * UC3 : player check for option
 */
	public int calculatePlayerValue(int player, int diceValue)
	{
		player = player + diceValue;
		/*
		 * UC4 : repeat till the player reaches the winning position 100
		 */
			
			if(player > WINPOINT)
			{
			player = player - diceValue;
			return player;
			}
		
			if(null!=ladder.get(player))
			{
				System.out.println("climb up the ladder");
				player= ladder.get(player);
			}

			if(null!=snake.get(player))
			{
				System.out.println("swallowed by snake");
				player= snake.get(player);
			}
			return player;
	}

	public boolean isWin(int player)
	{
		return WINPOINT == player;
	}

public static void main(String[] args) {
		System.out.println("Welcome To Snake & Ladder");
		SnakeNLadder uc1 = new SnakeNLadder();
		uc1.startGame();
	}
}
