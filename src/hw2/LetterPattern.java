package hw2;

public class LetterPattern {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)('A' + i));
			}
			System.out.println();
		}
	}

}
