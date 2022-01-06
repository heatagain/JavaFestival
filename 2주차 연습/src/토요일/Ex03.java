package ≈‰ø‰¿œ;

public class Ex03 {

	public static void main(String[] args) {

		int i;
		int j;
		char a = 'A';
		int k = 0;
		int[][] array = new int[5][5];

		for (i = 0; i < array.length; i++) {
			for(j = k; j <= 4-k; j++) {
				array[i][j] = a;
				a++;
			}
			if(i < 2) { 
				k++;
			} else {
				k--;
			}
		}
		for (i = 0; i < array.length; i++) {
			for(j = 0; j < array.length; j++) {
				System.out.print((char)array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
