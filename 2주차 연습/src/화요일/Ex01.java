package ȭ����;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		int[] array = new int[8];
		Random random = new Random();
		int i;
		int max = 0;
		int min = 0;

		for (i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
		}
		System.out.print("�迭�� �ִ� ��� �� : ");
		for (i = 0; i < 8; i++) {
			System.out.print(array[i] + " ");
		}
		
		max = array[0];
		min = array[0];
		for (i = 1; i < 8; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}

		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);

	}

}
