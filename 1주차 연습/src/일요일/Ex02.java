package 일요일;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int result = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A입력 >> ");
			num1 = sc.nextInt();
			System.out.print("B입력 >> ");
			num2 = sc.nextInt();
			if (num1 != 0 && num2 != 0) {	
				result = num1 - num2;
				System.out.println("결과 >> " + result);
			} else
				break;
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
