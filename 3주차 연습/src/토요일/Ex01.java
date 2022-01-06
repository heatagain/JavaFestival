package Åä¿äÀÏ;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println(isHarshad(10));

	}

	public static boolean isHarshad(int num) {

		int mok = 0;
		int sum = 0;
		int num2 = num;

		while (mok != 1) {
			mok = num / 10;
			sum += num % 10;
			num = mok;
			if (num == 1) {
				sum += num;
			}
		}
		
		if (num2 % sum == 0) {
			return true;
		} else
			return false;
	}
}
