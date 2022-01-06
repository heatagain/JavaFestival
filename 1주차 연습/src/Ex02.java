import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int i;
		int m;
		int ft;
		int t;
		int fh;
		int h;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재금액 : ");
		i = sc.nextInt();
		
		m = i / 10000;
		ft = (i % 10000) / 5000;
		t = (i % 10000) % 5000 / 1000;
		fh = (i % 10000) % 5000 % 1000 / 500;
		h = (i % 10000) % 5000 % 1000 % 500 / 100;
		
		
		System.out.println("잔돈변환");
		System.out.println("10000원 : " + m + "개");
		System.out.println("5000원 : " + ft + "개");
		System.out.println("1000원 : " + t + "개");
		System.out.println("500원 : " + fh + "개");
		System.out.println("100원 : " + h + "개");
		
		sc.close();

	}

}
