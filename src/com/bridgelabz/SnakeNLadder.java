package com.bridgelabz;

import java.util.Scanner;

public class SnakeNLadder {
/*
 * UC1 : snake and ladder game played with single player at start position 0
 */
	public void startGame() {
		int player1 =0;
		System.out.println("Start Position Of Player1: "+player1);
		Scanner sc = new Scanner(System.in);
		String str;
		int diceValue =0;
		System.out.println("Press r to roll Dice");
		str = sc.next();
         diceValue=1+(int)Math.floor(Math.random()*6);
        System.out.println(" number on dice : " +diceValue);

		}

public static void main(String[] args) {
		System.out.println("Welcome To Snake & Ladder");
		SnakeNLadder uc1 = new SnakeNLadder();
		uc1.startGame();
	}
}
