package 토요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;
		int i;
		int j;
		int num = 1;

		System.out.print("배열의 크기인 정수를 입력하시오 : ");
		input = sc.nextInt();

		int[][] array = new int[input][input];

		for (i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < array.length; j++) {
					array[i][j] = num;
					num++;
				}
			} else {
				for (j = array.length - 1; j >= 0; j--) {
					array[i][j] = num;
					num++;
				}
			}
		}
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
