package hw4;

import java.util.Scanner;

public class DayOfYearCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 輸入年份
		System.out.print("請輸入年份 (yyyy): ");
		int year = scanner.nextInt();

		// 輸入月份
		System.out.print("請輸入月份 (mm): ");
		int month = scanner.nextInt();

		// 輸入日期
		System.out.print("請輸入日期 (dd): ");
		int day = scanner.nextInt();

		// 驗證輸入是否有效
		if (!isValidDate(year, month, day)) {
			System.out.println("錯誤: 輸入的日期無效!");
			return;
		}

		// 計算並顯示結果
		int dayOfYear = calculateDayOfYear(year, month, day);
		System.out.printf("輸入的日期為該年第%d天%n", dayOfYear);

	}

	// 檢查日期是否有效
	public static boolean isValidDate(int year, int month, int day) {
		if (year < 1)
			return false;
		if (month < 1 || month > 12)
			return false;

		int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (day < 1 || day > daysInMonth[month - 1]) {
			return false;
		}

		return true;
	}

	// 判斷是否為閏年
	public static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else {
			return year % 400 == 0;
		}

	}

	// 計算一年中的第幾天
	public static int calculateDayOfYear(int year, int month, int day) {
		int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dayOfYear = 0;

		// 累加前幾個月的天數
		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i];
		}

		// 加上當月的天數
		dayOfYear += day;

		return dayOfYear;

	}

}
