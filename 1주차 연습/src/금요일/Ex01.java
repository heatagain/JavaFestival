package 금요일;

public class Ex01 {

	public static void main(String[] args) {

		int i = 0;
		int result = 0;

		for (i = 1; i <= 100; i++) {

			System.out.print(i);
			if (i < 100) {
				if (i % 2 == 0) {
					System.out.print(" + ");
				} else {
					System.out.print(" - ");
				}
			}
		}
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				result = result - i;
			} else {
				result = result + i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + result);
	}

}
