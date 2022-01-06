package 목요일;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		int temp;
		int[] ex = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };	// 각 숫자별 대시 갯수 배열에 저장

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int inputNum = sc.nextInt();

		while (inputNum != 0) {	// inputNum이 0이 아닐 때 동안 반복
			temp = inputNum % 10;	// inputNum을 10으로 나눈 나머지 temp에 저장 (뒤로 
			inputNum /= 10;	// inputNum에 10을 나눈 몫을 저장
			result += ex[temp];	// result에 대시 갯수 저장
		}

		System.out.println("대시('-')의 총 합 >> " + result);

	}

}
