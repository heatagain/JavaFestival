package �Ͽ���;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int i;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���μ������� ���� �Է��ϼ���. : ");
		num = sc.nextInt();	// ���μ� ������ �� num���� �Է� ����
		
		System.out.print(num + " = ");
		
		for(i = 2; i <= num; i++) {	// i�� 2���� num���� 1�� �����ϸ鼭
			while(num % i == 0) {	// �Է� ���� ���� i�� ���� �������� 0�� ��
				System.out.print(i);	//i�� �ϳ� ���
				num = num / i;	// num / i�� ���� num�� ����
				if(num != 1) {	// *��ȣ�� ����ϱ� ���� num�� ��(num / i�� ��)�� 1�� �ƴ� ������ * ���, 
					// ex) �� if�� ���� ����� ��� 120 = 2*2*2*3*5* �̷� ���� ��µ�
				System.out.print("*");
				}
			}
		}
		sc.close();
	}

}
