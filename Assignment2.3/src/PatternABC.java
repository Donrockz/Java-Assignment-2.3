
public class PatternABC {

	public static void main(String[] args) {

		int a = 0;

		long b = (int) a + 1;

		float c = (long) b + 4;

		for (a = 0; a <= c; a++) {

			if (a == 0) {
				System.out.println("  a");
			} else if (a == b) {
				System.out.println(" aba ");
			} else if (a == b + 1) {
				System.out.println("abcba");
			} else if (a == c - 2) {
				System.out.println(" aba ");
			} else if (a == c - 1) {
				System.out.println("  a");
			}

		}
	}
}
