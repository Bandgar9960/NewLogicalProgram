package logicalProgram;
class BinaryNumber {

	// Function to check if number
	// is binary or not
	public static boolean isBinaryNumber(int num) {

		// Get the rightmost digit of
		// the number with the help
		// of remainder '%' operator
		// by dividing it with 10
		while (num != 0) {

			// If the digit is greater
			// than 1 return false
			if (num % 10 > 1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

	public static void main(String args[]) {
		// Given Number N
		int N = 112;

		// Function Call
		System.out.println(isBinaryNumber(N));
	}
}
