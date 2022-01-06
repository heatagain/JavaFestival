package 토요일;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int i;
		int num;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		num = sc.nextInt();
		
		for(i = 2; i <= num; i++) {	// 팩토리얼 출력하는 메소드, 입력받은 num까지 i를 증가 시킴
			result = result * i;	// i를 result 값에 곱함
			
		}
		System.out.println("출력 : " + result);	// int형 자료형 크기를 넘어가는 결과값은 출력되지 않음
		sc.close();
		
	}

}
