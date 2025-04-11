package hw4;

import java.util.Scanner;

public class Borrowmoney {
	public static void main(String[] args) {
		int[][] employees = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入欲借的金額: ");
		int amount = scanner.nextInt();

		System.out.print("有錢可借的員工編號: ");
		int count = 0;

		for (int[] employee : employees) {
			if (employee[1] >= amount) {
				System.out.print(employee[0] + " ");
				count++;
			}
		}

		System.out.println("共" + count + "人!");

		scanner.close();
	}
}
