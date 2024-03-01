package Lab1_1;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		System.out.println("Complex Number Calculator");
		System.out.println("+ : Addition");
		System.out.println("- : Subtraction");
		System.out.println("* : Multiplication");
		int re1 = 2, re2 = 4, im1 = 5, im2 = -1;
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an operation");
		char operator = in.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println((re1+re2) + " + i" +(im1+im2));
			break;
		case '-':
			System.out.println((re1-re2) + " + i" +(im1-im2));
			break;
		case '*':
			System.out.println((re1*re2 - im1*im2) + " + i" + (re1*im2+re2*im1));
			break;
		default:
			System.out.println("ERROR!");
		}
	}
}