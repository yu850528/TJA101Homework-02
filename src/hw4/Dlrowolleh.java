package hw4;

public class Dlrowolleh {
	public static void main(String[] args) {
		String s = "Hello World";
		char[] chars = s.toCharArray();
		String reversed = "";
		
		for (int i = chars.length - 1; i >= 0; i--) {
			reversed += chars[i];
		}
		System.out.println(reversed);
	}

}
