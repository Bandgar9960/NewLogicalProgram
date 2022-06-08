package logicalProgram;

import java.util.Scanner;

public class StringResverseAndParindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your String here.....!!");

		String name = sc.next();

		String rev = "";

		int len = name.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		if (name.equals(rev)) {

			System.out.println("This is Palindrome String");

		} else {

			System.out.println("This is Not Palindrome String");
		}

	}

}
