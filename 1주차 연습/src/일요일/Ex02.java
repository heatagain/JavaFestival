package �Ͽ���;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int result = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A�Է� >> ");
			num1 = sc.nextInt();
			System.out.print("B�Է� >> ");
			num2 = sc.nextInt();
			if (num1 != 0 && num2 != 0) {	
				result = num1 - num2;
				System.out.println("��� >> " + result);
			} else
				break;
		}
		System.out.println("���α׷� ����");
		sc.close();
	}

}
