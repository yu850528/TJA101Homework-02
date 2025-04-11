package hw3;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		int ans100 = (int) ((Math.random() * 101));
		Scanner sc = new Scanner(System.in);
		System.out.println("猜數字(範圍是0~100)：");
		for (int y = 0; y != ans100;) {
			if (sc.hasNextInt()) {
				y = sc.nextInt();
			} else {
				System.out.println("請輸入整數");
				break;
			}
			if (y > ans100) {
				System.out.println("猜低一點");
			} else if (y < ans100) {
				System.out.println("猜高一點");
			} else if (y == ans100) {
				System.out.println("答對了！答案就是" + ans100);
				break;
				
			}
			
		}
		sc.close();
	}
}
