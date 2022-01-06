package ±›ø‰¿œ;

public class Ex03 {

	public static void main(String[] args) {

		System.out.println(getMiddle("poer"));

	}

	public static char[] getMiddle(String x1) {

		char[] ch = x1.toCharArray();
		char[] middle = new char[2];

		if (ch.length % 2 == 0) {
			middle[0] = ch[ch.length / 2 - 1];
			middle[1] = ch[ch.length / 2];
		} else {
			middle[0] = ch[(int)ch.length / 2];
		}

		return middle;
	}

}
