
public class VolewCounter {

	private int[][] _counts = new int[vowels.length][2];
	private static char[] vowels = { 'A', 'E', 'I', 'O', 'U' };

	public void processLine(String input) {

		char[] inputArr = input.toCharArray();

		for (int i = 0; i < inputArr.length; ++i) {

			for (int c = 0; c < vowels.length; ++c) {

				if (inputArr[i] == Character.toLowerCase(vowels[c])) {
					_counts[c][0]++;
				}

				if (inputArr[i] == vowels[c]) {
					_counts[c][1]++;
				}
			}
		}
	}

	public void printSummary() {

		for (int c = 0; c < vowels.length; ++c) {
			System.out.print(vowels[c] + ": " + _counts[c][0] + ", " + _counts[c][1] + " = "
					+ (_counts[c][0] + _counts[c][1]) + "\n");
		}
	}
}

// A: 0  2
// E: 3  2
