package �����;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int[] array = new int[5];
		int input;

		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < 5; k++) {
			System.out.print((k + 1) + "��° �� �Է� : ");
			input = sc.nextInt();
			array[k] = input;
		}
		
		// ��������
		for (int i = 0; i < array.length; i++) {
			int minInx = i;
			for (int k = i + 1; k < array.length; k++) {
				if(array[minInx] > array[k]) {
					minInx = k;
				}
			}
			int temp = array[i];
			array[i] = array[minInx];
			array[minInx] = temp;
			
		}
		System.out.println("���� ��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

//		System.out.println(Arrays.toString(array));

	}

}
