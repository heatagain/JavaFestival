package 목요일;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int[] array = new int[5];
		int input;

		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < array.length; k++) {
			System.out.print((k + 1) + "번째 수 입력 : ");
			input = sc.nextInt();
			array[k] = input;
		}

		for (int i = 1; i < array.length; i++) { // 버블 도는 횟수
			for (int k = 0; k < array.length - i; k++) {
				if (array[k] > array[k + 1]) {
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
				}
			}

		}

		System.out.println("정렬 후");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
