package �����;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		int temp;
		int[] ex = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };	// �� ���ں� ��� ���� �迭�� ����

		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int inputNum = sc.nextInt();

		while (inputNum != 0) {	// inputNum�� 0�� �ƴ� �� ���� �ݺ�
			temp = inputNum % 10;	// inputNum�� 10���� ���� ������ temp�� ���� (�ڷ� 
			inputNum /= 10;	// inputNum�� 10�� ���� ���� ����
			result += ex[temp];	// result�� ��� ���� ����
		}

		System.out.println("���('-')�� �� �� >> " + result);

	}

}
