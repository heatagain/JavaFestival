package ȭ����;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array = new int[6];
		int i;
		int j;
		
		for(i = 0; i < array.length; i++) {	// �迭 array �ε����� 0���� ������ �湮�ϱ� ���� for��
			
			array[i] = random.nextInt(45) + 1;	// 
			for(j = 0; j < i; j++) {
				if(array[i] == array[j]) {
				i--;
				}
			}
		}
		
		for(i = 0; i< array.length; i++) {
			System.out.println("����� ���ڴ� " + array[i]);
		}
	
	}

}
