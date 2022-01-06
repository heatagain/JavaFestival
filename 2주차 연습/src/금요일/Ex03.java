package ±›ø‰¿œ;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {

		int[][] array = new int[7][7];

		int k = 2;
		int num = 1;

		for (int i = 0; i <= 6; i++) {
			if (i <= 3) {
				k++;
			} else {
				k--;
			}
			for (int j = 6 - k; j <= k; j++) {
				array[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
