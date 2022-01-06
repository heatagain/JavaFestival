package ±›ø‰¿œ;

public class Ex01 {
	
	public static int bbN = 1;
	public static int bN = 1;
	public static int cN = 0;

	public static void main(String[] args) {

		int input = 8;

		for (int i = 1; i <= input; i++) {

			System.out.print(fibo(i) + " ");
		}

	}

	public static int fibo(int i) {
		
		if(i == 1) {
			return bbN;	
		}
		else if(i == 2) {
			return bN;
		}
		
		cN = bbN + bN;
		bbN = bN;
		bN = cN;
		
		return cN;
		
		
	}

}
