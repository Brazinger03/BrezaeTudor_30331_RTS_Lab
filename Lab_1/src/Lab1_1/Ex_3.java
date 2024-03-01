package Lab1_1;

import java.util.Arrays;

public class Ex_3 {
	public static void main(String args[]) {
		int randMat[] = new int[10];
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		System.out.println("Random array is: ");
		for(int i = 0; i<10; i++) {
			randMat[i] = (int)(Math.random()*range) + min;
			System.out.print(randMat[i] + " ");
		}
		System.out.println();
		Arrays.sort(randMat);
		System.out.println("Sorted array is: ");
		for(int i = 0; i<10; i++) {
			System.out.print(randMat[i] + " ");
		}
	}
}
