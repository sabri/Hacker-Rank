package com.hackerrank.artificialintelligence.botbuilding;

import java.util.Scanner;

/**
 *Problem Statement

 In this version of "Bot saves princess", Princess Peach and bot's position are randomly set. Can you save the princess?

 Task

 Complete the function nextMove which takes in 4 parameters - an integer N, integers r and c indicating the row & column position of the bot and the character array grid - and outputs the next move the bot makes to rescue the princess.

 Input Format

 The first line of the input is N (<100), the size of the board (NxN). The second line of the input contains two space separated integers, which is the position of the bot.

 Grid is indexed using Matrix Convention

 The position of the princess is indicated by the character 'p' and the position of the bot is indicated by the character 'm' and each cell is denoted by '-' (ascii value: 45).

 Output Format

 Output only the next move you take to rescue the princess. Valid moves are LEFT, RIGHT, UP or DOWN

 Sample Input

 5
 2 3
 -----
 -----
 p--m-
 -----
 -----
 Sample Output

 LEFT
 Scoring 
 Your score for every testcase would be (NxN minus number of moves made to rescue the princess)/10 where N is the size of the grid (5x5 in the sample testcase). Maximum score is 17.5
 */
/**
 * 
 * @author Shrey
 *
 */
public class BotSavesPrincess_2 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n, x, y;
		n = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
		in.useDelimiter("\r\n");
		String board[] = new String[n];

		for (int i = 0; i < n; i++) {
			board[i] = in.next();
		}
		in.close();
		nextMove(n, x, y, board);
	}

	static void nextMove(int n, int x, int y, String[] board) {
		int pr = 0, pc = 0;
		for (int i = 0; i < n; i++) {
			int pi = board[i].indexOf('p');
			if (pi >= 0) {
				pr = i;
				pc = pi;
			}
		}
		if (pr < x)
			System.out.println("UP");
		else if (pr > x)
			System.out.println("DOWN");
		else if (pc < y)
			System.out.println("LEFT");
		else if (pc > y)
			System.out.println("RIGHT");
	}
}
