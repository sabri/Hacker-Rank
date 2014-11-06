package com.hackerrank.arraysorting;

import java.util.Scanner;

/**Mark is an undergraduate student and he is interested in rotation. A conveyor belt competition is going on in the town which Mark wants to win. In the competition, there's A conveyor belt which can be represented as a strip of 1xN blocks. Each block has a number written on it. The belt keeps rotating in such a way that after each rotation, each block is shifted to left of it and the first block goes to last position.

 There is a switch near the conveyer belt which can stop the belt. Each participant would be given a single chance to stop the belt and his PMEAN would be calculated.

 PMEAN is calculated using the sequence which is there on the belt when it stops. The participant having highest PMEAN is the winner. There can be multiple winners.

 Mark wants to be among the winners. What PMEAN he should try to get which guarantees him to be the winner.

 PMEAN=∑i=1ni×a[i]
 where a represents the configuration of conveyor belt when it is stopped. Indexing starts from 1.

 Input Format 
 First line contains N denoting the number of elements on the belt. 
 Second line contains N space separated integers.

 Output Format 
 Output the required PMEAN

 Constraints 
 1 ≤ N ≤ 106 
 -109 ≤ each number ≤ 109 
 For any rotation, PMEAN will always lie within the range of 64-bit signed integer.

 Sample Input

 3
 20 30 10 
 Sample Output

 140
 Explanation

 Number on top can be written in these manners. 
 Initial numbers on belt, 20 30 10 PMEAN = 1x20 + 2x30 + 3x10 = 110 
 After first rotation, 30 10 20 PMEAN = 1x30 + 2x10 + 3x20 = 110 
 After second rotation, 10 20 30 PMEAN = 1x10 + 2x20 + 3x30 = 140 
 So maximum possible value will be 140.*/

/**
 * @author Shrey
 *
 */
public class GameOfRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] a = new long[N];

		// long max = 0;
		long sum = 0;
		long currentPmean = 0;
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
			sum += a[i];
			currentPmean += a[i] * (i + 1);
		}
		System.out.println(gameOfRotation(a, currentPmean, sum));
		scan.close();
	}

	public static long gameOfRotation(long[] a, long b, long sum) {
		long max = b;
		for (int i = 0; i < a.length - 1; ++i) {
			b = b - sum + a[i] * a.length;
			max = Math.max(b, max);
		}
		return max;
	}

	/*
	 * public static long gameOfRotation(long[] a, long sum) { int c = 0; int l
	 * = a.length - 1; int len = a.length; while (c < l) { long initial = a[0];
	 * long newSum = 0; for (int i = 0; i < len; i++) { if (i + 1 < len) { a[i]
	 * = a[i + 1]; } else { a[i] = initial; } newSum = newSum + a[i] * (i + 1);
	 * } sum = Math.max(newSum, sum); c++; } return sum; }
	 */
}
