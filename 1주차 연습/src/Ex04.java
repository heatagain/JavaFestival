import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();

		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();

		int first = num2 % 10; // ù��° �ڸ���
		int result1 = num1 * first;
		System.out.println(result1);

		int second = num2 % 100; // �ι�° �ڸ���
		second = second / 10;
		int result2 = num1 * second;
		System.out.println(result2);

		int third = num2 / 100; // ����° �ڸ���
		int result3 = num1 * third;
		System.out.println(result3);

		result2 *= 10;
		result3 *= 100;

		System.out.println(result1 + result2 + result3);

		sc.close();

	}

}
