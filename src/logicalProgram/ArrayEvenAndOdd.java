package logicalProgram;

public class ArrayEvenAndOdd {

	public static void main(String[] args) {

		int arr[] = { 10, 21, 15, 38, 77 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				System.out.println("Even number is " + arr[i]);
			}

		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {

				System.out.println("Odd number is " + arr[i]);
			}

		}

	}

}
