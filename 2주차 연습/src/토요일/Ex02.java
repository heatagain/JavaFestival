package �����;

public class Ex02 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int num = 1;
		int[][] array = new int[5][5];
		
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		
		System.out.println("����");
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("90�� ȸ��");
		for (i = 4; i >= 0; i--) {
			for (j = 0; j < array.length; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
		
	}

}
