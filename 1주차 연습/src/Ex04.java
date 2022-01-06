import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();

		int first = num2 % 10; // 첫번째 자릿수
		int result1 = num1 * first;
		System.out.println(result1);

		int second = num2 % 100; // 두번째 자릿수
		second = second / 10;
		int result2 = num1 * second;
		System.out.println(result2);

		int third = num2 / 100; // 세번째 자릿수
		int result3 = num1 * third;
		System.out.println(result3);

		result2 *= 10;
		result3 *= 100;

		System.out.println(result1 + result2 + result3);

		sc.close();

	}

}
