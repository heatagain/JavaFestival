package ±İ¿äÀÏ;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		int A[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int B[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int Merge[] = mergeArray(A, B);

		System.out.println("Merge : " + Arrays.toString(Merge));

	}

	public static int[] mergeArray(int A[], int B[]) {

		int[] array = new int[20];

		for (int i = 0; i < 10; i++) {
			array[i] = A[i];
		}
		for (int i = 10; i < array.length; i++) {
			array[i] = B[i - 10];
		}

		for (int i = 0; i < array.length; i++) {
			int minNum = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minNum] > array[j]) {
					minNum = j;
				}

			}
			int temp = array[i];
			array[i] = array[minNum];
			array[minNum] = temp;

		}

		return array;
	}

}
