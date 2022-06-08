package logicalProgram;

import java.util.Scanner;
//0 1 
public class BinaryNew {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number here....!!!");
     //111
		int num = sc.nextInt();

		if (num != 0) {

			if (num % 10 > 1) {

				System.out.println("Number NOT is binary");

			} else {

				System.out.println("Number is  Binary");
			}

		}
		
		sc.close();

	}

}
