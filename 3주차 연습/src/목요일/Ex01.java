package �����;

public class Ex01 {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int x1, int x2) {

		int sum = 0;

		System.out.print(x1 + "~" + x2 + "������ ������ : ");

		for (int i = x1; i <= x2; i++) {
			for (int j = 1; j < i; j++) {	// �ڱ� �ڽ��� ������ ������ ������
				if (i % j == 0) {	// 0���� ������ �������� sum������ ����
					sum = sum + j;
				}
				
			}
			if (i == sum) {	// i�� sum�� ������ ���
				System.out.print(sum + " ");
			}
			sum = 0;	// ���� ���� ����ϱ� ���� sum�� 0���� �ʱ�ȭ
		}

	}
}
