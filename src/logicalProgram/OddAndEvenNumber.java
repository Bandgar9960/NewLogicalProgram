package logicalProgram;

import java.util.Scanner;

public class OddAndEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number here....!!");

		int num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("Number is Even");

		} else {

			System.out.println("Number is Odd");
		}

	}

}
