package �����;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int i = 0;
		int max = 0;
		int min = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("�ִ� ����� & �ּ� ����� ���ϱ�");
		System.out.print("����1�Է�>> ");
		num1 = sc.nextInt();
		System.out.print("����2�Է�>> ");
		num2 = sc.nextInt();

		for (i = 1; i <= num1 && i <= num2; i++) {	// num1�� num2�� '����� ���'�� ���ϱ� ���� ���� 1���� num1 && num2 ���� �۰ų� ���� ������ �������Ѽ�
			if (num1 % i == 0 && num2 % i == 0) {	// �������� ������ �������� i ���� max�� ����
				max = i;
			}
		}
//		while (i <= num1 && i <= num2) {		// while������ �Ұ��
//			if(num1 % i == 0 && num2 % i == 0) {
//				max = i;
//			}
//			i++;
//		}
		min = (num1 * num2) / max;	// �ּҰ������ num1�� num2�� ���� ���� �ִ������� ������ ����

		System.out.println("�ִ����� : " + max);
		System.out.println("�ּҰ���� : " + min);
		
		sc.close();
	}

}
