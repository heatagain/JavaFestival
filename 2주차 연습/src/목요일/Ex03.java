package �����;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int[] array = new int[5];
		int input;

		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < array.length; k++) {
			System.out.print((k + 1) + "��° �� �Է� : ");
			input = sc.nextInt();
			array[k] = input;
		}

		for (int i = 1; i < array.length; i++) { // ���� ���� Ƚ��
			for (int k = 0; k < array.length - i; k++) {
				if (array[k] > array[k + 1]) {
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
				}
			}

		}

		System.out.println("���� ��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
