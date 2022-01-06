package 목요일;

public class Ex01 {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int x1, int x2) {

		int sum = 0;

		System.out.print(x1 + "~" + x2 + "까지의 완전수 : ");

		for (int i = x1; i <= x2; i++) {
			for (int j = 1; j < i; j++) {	// 자기 자신을 제외한 수까지 나눠봄
				if (i % j == 0) {	// 0으로 나누어 떨어지면 sum변수에 더함
					sum = sum + j;
				}
				
			}
			if (i == sum) {	// i와 sum과 같으면 출력
				System.out.print(sum + " ");
			}
			sum = 0;	// 다음 수를 계산하기 위해 sum을 0으로 초기화
		}

	}
}
