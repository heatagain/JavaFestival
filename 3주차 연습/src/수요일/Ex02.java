package 수요일;

public class Ex02 {

	public static void main(String[] args) {

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findKim(names));

	}

	public static String findKim(String[] x1) {

		String str = "";
		for (int i = 0; i < x1.length; i++) {
			if (x1[i].equals("Kim")) {
				str = "김서방은 " + (i + 1) + "에 있다.";
			}

		}
		return str;

	}
}
