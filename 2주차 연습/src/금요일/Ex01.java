package 금요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = 0;
		int j = 0;
		int num = 1;
		
		System.out.print("정수 N 입력 : ");
		int i = sc.nextInt();
		
		int[][] array = new int[i][i];

		for (j = 0; j < array.length; j++) {
			for (k = 0; k < array.length; k++) {
				array[k][j] = num;
				num++;
			}
		}
		for (k = 0; k < array.length; k++) {
			for (j = 0; j < array.length; j++) {
				System.out.print(array[k][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
