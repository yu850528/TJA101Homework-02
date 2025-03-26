package hw1;

public class BankInterest {
	public static void main(String[] args) {
		int y, $ = 1500000;
		double rate = 0.02;
		double saving = $ * (1 + rate);
		for (y = 1; y <= 10; y++) {
			saving *= (1 + rate);
		}
		System.out.println("複利10年本金加利息共有" + (int) saving + "元");
	}

}
