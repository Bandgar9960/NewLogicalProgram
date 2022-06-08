package logicalProgram;

public class StringVoluvesFindOut {

	public static void main(String[] args) {

		String name = "Dnyaneshwar";

		char[] array = name.toCharArray();
		char[] array1 = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array1.length; j++) {

				if (array[i] == array1[j]) {

					System.out.println(array[i]);
				}

			}
		}
	}

}
