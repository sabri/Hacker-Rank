package com.hackerrank.arraysorting;

import java.util.Scanner;

/**John Watson performs an operation called Right Circular Rotation on an integer array a0,a1 ... an-1. Right Circular Rotation transforms the array from a0,a1 ... aN-1 to aN-1,a0,... aN-2.

 He performs the operation K times and tests Sherlock's ability to identify the element at a particular position in the array. He asks Q queries. Each query consists of one integer x, for which you have to print the element ax.

 Input Format 
 The first line consists of 3 integers N, K and Q separated by a single space. 
 The next line contains N space separated integers which indicates the elements of the array A. 
 Each of the next Q lines contain one integer per line denoting x.

 Output Format 
 For each query, print the value in the location in a newline.

 Constraints 
 1 ≤ N ≤ 105 
 1 ≤ A[i] ≤ 105 
 1 ≤ K ≤ 105 
 1 ≤ Q ≤ 500 
 0 ≤ x ≤ N-1

 Sample input

 3 2 3
 1 2 3
 0
 1
 2
 Sample output

 2
 3
 1
 Explanation 
 After one rotation array becomes, 3 1 2. 
 After another rotation array becomes 2 3 1. 
 Final array now is 2,3,1. 0th element of array is 2. 
 1st element of array is 3. 
 2nd element of array is 1.*/

/**
 * @author Shrey
 *
 */
public class SherlockAndWatson {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int Q = scan.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}
		/** Right Circular Rotation */

		int a = 0;
		while (a < K) {
			for (int i = 0; i < array.length; i++) {
				
			}
			a++;
		}

		for (int i = 0; i < Q; i++) {
			System.out.print(array[i] + ",");
		}

		for (int i = 0; i < Q; i++) {
			int x = scan.nextInt();
			System.out.println(getValueAtX(x, array));
		}

		scan.close();
	}

	public static int getValueAtX(int x, int[] arr) {
		return arr[x];
	}
}
