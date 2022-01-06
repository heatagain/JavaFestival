import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int i;
		int j;
		int k;
		int o;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("³âµµ ÀÔ·Â >> ");
		i = sc.nextInt();
		
		j = i % 4;
		k = i % 100;
		o = i % 400;
		
		if(j == 0 && k != 0 || o == 0) {
			System.out.println("À±³â");
			
		} else {
			System.out.println("À±³â ¾Æ´Ô");
		}
		sc.close();
	}

}
