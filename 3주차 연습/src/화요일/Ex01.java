package ȭ����;

public class Ex01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);
		

	}
	
	public static boolean isDivide(int x1, int x2) {
		
		if(x1 % x2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
