package »≠ø‰¿œ;

public class Ex02 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1, num2, op));
		

	}
	
	public static int cal(int x1, int x2, char op) {
		
		if(op == '-') {
			return x1 - x2;
		} else if(op == '+') {
			return x1 + x2;
		} else if(op == '*') {
			return x1 * x2;
		}else if(op == '/') {
			return x1 / x2;
		}
		else {
			return 0;
		}
		
	}

}
