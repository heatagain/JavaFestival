package ≈‰ø‰¿œ;

public class Ex02 {

	public static void main(String[] args) {

		System.out.println(jumpCase(7));
	}

	public static int jumpCase(int x) {
		
		int answer = 0;
		int bn = 1;
		int bbn = 1;

		for (int i = 1; i < x; i++) {

			answer = bbn + bn;
			bbn = bn;
			bn = answer;
		}

		return answer;
	}

}
