package 월요일;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int i;
		int j;
		int o;
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		o = sc.nextInt();

		for (i = 1; i <= o; i++) {
			for (j = o; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
