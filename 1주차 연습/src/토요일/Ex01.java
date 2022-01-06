package 토요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int i = 0;
		int max = 0;
		int min = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("최대 공약수 & 최소 공배수 구하기");
		System.out.print("숫자1입력>> ");
		num1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		num2 = sc.nextInt();

		for (i = 1; i <= num1 && i <= num2; i++) {	// num1과 num2의 '공통된 약수'를 구하기 위해 숫자 1부터 num1 && num2 보다 작거나 같은 값까지 증가시켜서
			if (num1 % i == 0 && num2 % i == 0) {	// 공통으로 나누어 떨어지는 i 값을 max에 저장
				max = i;
			}
		}
//		while (i <= num1 && i <= num2) {		// while문으로 할경우
//			if(num1 % i == 0 && num2 % i == 0) {
//				max = i;
//			}
//			i++;
//		}
		min = (num1 * num2) / max;	// 최소공배수는 num1과 num2를 곱한 값에 최대공약수를 나누면 나옴

		System.out.println("최대공약수 : " + max);
		System.out.println("최소공배수 : " + min);
		
		sc.close();
	}

}
