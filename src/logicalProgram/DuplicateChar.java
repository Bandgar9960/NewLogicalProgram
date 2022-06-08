package logicalProgram;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name here....!!");
		String name = sc.next();

		char[] array = name.toCharArray();

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					System.out.println(array[j]);
				}
			}

		}
	}
}
