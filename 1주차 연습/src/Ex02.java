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
		
		System.out.print("����ݾ� : ");
		i = sc.nextInt();
		
		m = i / 10000;
		ft = (i % 10000) / 5000;
		t = (i % 10000) % 5000 / 1000;
		fh = (i % 10000) % 5000 % 1000 / 500;
		h = (i % 10000) % 5000 % 1000 % 500 / 100;
		
		
		System.out.println("�ܵ���ȯ");
		System.out.println("10000�� : " + m + "��");
		System.out.println("5000�� : " + ft + "��");
		System.out.println("1000�� : " + t + "��");
		System.out.println("500�� : " + fh + "��");
		System.out.println("100�� : " + h + "��");
		
		sc.close();

	}

}
