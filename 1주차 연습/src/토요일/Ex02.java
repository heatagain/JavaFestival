package �����;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int i;
		int num;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		num = sc.nextInt();
		
		for(i = 2; i <= num; i++) {	// ���丮�� ����ϴ� �޼ҵ�, �Է¹��� num���� i�� ���� ��Ŵ
			result = result * i;	// i�� result ���� ����
			
		}
		System.out.println("��� : " + result);	// int�� �ڷ��� ũ�⸦ �Ѿ�� ������� ��µ��� ����
		sc.close();
		
	}

}
