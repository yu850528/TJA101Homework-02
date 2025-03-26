package hw2;

public class MathWhile {
	public static void main(String[] args) {
		int product = 1;
		int i = 1;
		while (i <= 10) {
			product *= i;
			i++;
		}
		System.out.println("1~10連乘積" + product);
	}

}
