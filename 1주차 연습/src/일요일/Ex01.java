package 일요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int i;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해할 수를 입력하세요. : ");
		num = sc.nextInt();	// 소인수 분해할 수 num으로 입력 받음
		
		System.out.print(num + " = ");
		
		for(i = 2; i <= num; i++) {	// i가 2부터 num까지 1씩 증가하면서
			while(num % i == 0) {	// 입력 받은 수를 i로 나눈 나머지가 0일 때
				System.out.print(i);	//i값 하나 출력
				num = num / i;	// num / i의 몫을 num에 넣음
				if(num != 1) {	// *기호를 출력하기 위해 num의 값(num / i의 몫)이 1이 아닐 때까지 * 출력, 
					// ex) 이 if문 없이 출력할 경우 120 = 2*2*2*3*5* 이런 값이 출력됨
				System.out.print("*");
				}
			}
		}
		sc.close();
	}

}
