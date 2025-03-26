package hw2;

public class MathFor {
	public static void main(String[] args) {
		int product = 1;
		for (int i = 1; i <= 10; i++) {

			product *= i;
		}
		System.out.println("1~10連乘積" + product);
	}

}
