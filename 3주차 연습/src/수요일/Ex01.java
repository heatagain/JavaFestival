package ������;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	public static char[] reverseStr(String x) {

		char[] ch = x.toCharArray();	// String���� �Ѱܹ��� x���� char�� �迭�� �ϳ��ϳ� ������ ����
		int[] numArray = new int[ch.length];	// �迭 ch ���̸�ŭ ������ �迭 ����

		for (int i = 0; i < numArray.length; i++) {	// ch�迭�� �ִ� �� int������ ���� ��ȯ �� numArray�� ����
			numArray[i] = (int)ch[i];
		}
		
		for(int i = 0; i < numArray.length; i++) {	// ������������ ��������
			int minNum = i;
			for(int j = i + 1; j < numArray.length; j++) {
				if(numArray[minNum] > numArray[j]) {
					minNum = j;
				}
				
			}
			
			int temp = numArray[i];
			numArray[i] = numArray[minNum];
			numArray[minNum] = temp;
			
		}
		
		for(int i = 0; i < numArray.length; i++) {	// char ������ ���� ��ȯ �� ch�迭�� ����
			ch[i] = (char)numArray[i];
		}
		return ch;

	}

}
