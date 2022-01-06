package 목요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int mok = 0;
		int na = 0;
		int[] array = new int[10];
		int k = -1;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력 >> ");
		int input = sc.nextInt();

		while (true) {
			mok = input / 2;
			na = input % 2;
			k = k + 1;
			array[k] = na;
			input = mok;
			
			if(input == 0) {
				break;
			}
		}

		for (int i = k; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
