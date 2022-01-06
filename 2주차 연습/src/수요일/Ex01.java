package 수요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int i;
		int n = 0;
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 : ");
		n = sc.nextInt();
		System.out.print("X 입력 : ");
		x = sc.nextInt();
		
		int[] array = new int[n];
		
		for(i = 0; i < n; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("결과 >> ");
		
		for(i = 0; i < array.length; i++) {
			if (x > array[i]) {
				System.out.print(array[i] + " ");
			}
			
		}
		sc.close();
	}

}
