package ������;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int i;
		int n = 0;
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N �Է� : ");
		n = sc.nextInt();
		System.out.print("X �Է� : ");
		x = sc.nextInt();
		
		int[] array = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("��� >> ");
		
		for(i = 0; i < array.length; i++) {
			if (x > array[i]) {
				System.out.print(array[i] + " ");
			}
			
		}
		sc.close();
	}

}
