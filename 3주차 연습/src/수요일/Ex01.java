package 수요일;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	public static char[] reverseStr(String x) {

		char[] ch = x.toCharArray();	// String으로 넘겨받은 x값을 char형 배열로 하나하나 나눠서 삽입
		int[] numArray = new int[ch.length];	// 배열 ch 길이만큼 정수형 배열 생성

		for (int i = 0; i < numArray.length; i++) {	// ch배열에 있는 값 int형으로 강제 변환 후 numArray에 삽입
			numArray[i] = (int)ch[i];
		}
		
		for(int i = 0; i < numArray.length; i++) {	// 오름차순으로 선택정렬
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
		
		for(int i = 0; i < numArray.length; i++) {	// char 형으로 강제 변환 후 ch배열에 삽입
			ch[i] = (char)numArray[i];
		}
		return ch;

	}

}
