package hw4;

public class Planet {
	public static void main(String[] args) {
		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int v = 0;
		for (String a : s) {
			for (int i = 0; i < a.length(); i++) {
				char ch = a.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					v++;
				}

			}

		}
		System.out.println("八大行星名稱中的母音總數: " + v);
	}
}