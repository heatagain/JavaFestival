package �����;

public class Ex03 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] str = score.split(",");
		String[] rank = { "A", "B", "C", "D", "E", "F" };

		for (int i = 0; i < rank.length; i++) {	// rank ���̸�ŭ i ����
			int num = 0;	// ��� ����� num 0���� �ʱ�ȭ

			for (int j = 0; j < str.length; j++) {	// rank�� str ���ؼ� ������ num++
				if (rank[i].equals(str[j])) {
					num++;
				}

			}
			System.out.println(rank[i] + " : " + num + "��");	// ��� ���

		}

	}

}
