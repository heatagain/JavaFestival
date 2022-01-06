package 목요일;

public class Ex03 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] str = score.split(",");
		String[] rank = { "A", "B", "C", "D", "E", "F" };

		for (int i = 0; i < rank.length; i++) {	// rank 길이만큼 i 증가
			int num = 0;	// 사람 명수인 num 0으로 초기화

			for (int j = 0; j < str.length; j++) {	// rank와 str 비교해서 있으면 num++
				if (rank[i].equals(str[j])) {
					num++;
				}

			}
			System.out.println(rank[i] + " : " + num + "명");	// 명수 출력

		}

	}

}
