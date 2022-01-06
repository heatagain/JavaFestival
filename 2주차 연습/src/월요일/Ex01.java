package 월요일;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int n;
		int j;
		int sum = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		n = sc.nextInt();
		
		for(j = 0; j < n; j++) {
			
			sum += j;
			System.out.print(sum);
			System.out.print(" ");
		}
		sc.close();

	}

}
