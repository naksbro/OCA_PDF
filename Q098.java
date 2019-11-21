package ocaPDFQuestions;

import java.util.Arrays;

public class Q098 { // D (remember even though the give lengths of both arrays in our 2D array is 3 the index stops at 2
					// making options A and B out of bounds. Option E replaces the last 'O' assigned in the question
					// remove "//" to test for yourself
	public static void main(String[] args) {
		char[][] grid = new char[3][3];
		grid[1][1] = 'x';
		grid[0][0] = 'o';
		grid[2][1] = 'x';
		grid[0][1] = 'o';
		grid[2][2] = 'x';
		grid[1][2] = 'o';

		// A
//		grid[1][3] = 'x';
//		System.out.println("A");
//		// for loop is only to show layout of array
//		for (int i = 0; i < grid.length; i++) {
//			System.out.println(Arrays.toString(grid[i]));
//		}

		// B
//		grid[3][1] = 'x';
//		System.out.println("B");
//		// for loop is only to show layout of array
//		for (int i = 0; i < grid.length; i++) {
//			System.out.println(Arrays.toString(grid[i]));
//		}

		// C
//		grid[0][2] = 'x';
//		System.out.println("C");
//		// for loop is only to show layout of array
//		for (int i = 0; i < grid.length; i++) {
//			System.out.println(Arrays.toString(grid[i]));
//		}

		// D
		grid[2][0] = 'x';
		System.out.println("D");
		// for loop is only to show layout of array
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}

		// E
//		grid[1][2] = 'x';
//		System.out.println("E");
//		// for loop is only to show layout of array
//		for (int i = 0; i < grid.length; i++) {
//			System.out.println(Arrays.toString(grid[i]));
//		}
	}
}
