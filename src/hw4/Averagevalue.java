package hw4;

public class Averagevalue {
	public static void main(String[] args) {
		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		double average = sum / numbers.length;
		System.out.println("平均值是：" + average);
		System.out.println("大於平均值的元素有：");
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > average) {

				System.out.println(numbers[i]);

			}
		}
	}
}
