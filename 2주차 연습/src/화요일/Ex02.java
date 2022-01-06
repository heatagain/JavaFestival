package 화요일;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array = new int[6];
		int i;
		int j;
		
		for(i = 0; i < array.length; i++) {	// 배열 array 인덱스에 0부터 끝까지 방문하기 위한 for문
			
			array[i] = random.nextInt(45) + 1;	// 
			for(j = 0; j < i; j++) {
				if(array[i] == array[j]) {
				i--;
				}
			}
		}
		
		for(i = 0; i< array.length; i++) {
			System.out.println("행운의 숫자는 " + array[i]);
		}
	
	}

}
