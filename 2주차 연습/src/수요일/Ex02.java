package ������;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		int i;
		int j;
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] num = new int[2];	// ���� �ε����� �����ϱ� ���� �迭
		int temp = 0;
		int min = 100;

		for (i = 0; i < 6; i++) {
			for (j = i + 1; j < 7; j++) {
				temp = point[i] - point[j];
				if(temp < 0) {
					temp *= -1;
				}
				if (temp < min) {
					num[0] = i;
					num[1] = j;
					min = temp;
				}
			}
		}
		System.out.print("result = ");
		System.out.print(Arrays.toString(num));

	}

}
