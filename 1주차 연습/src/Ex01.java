import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		i = sc.nextInt();
		
		System.out.println("�ݿø� �� �� : " + i);
		
		if(i % 10 >= 5) {
		i = i + 10 - i % 10;
		}
		else {
			i = i - i % 10;
		}
		
		System.out.println("�ݿø� �� �� : " + i);
		
		sc.close();
	}

}
