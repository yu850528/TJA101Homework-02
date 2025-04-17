package hw6;


import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("請輸入x的值：");
				String xInput= scanner.next();
				int x = Integer.parseInt(xInput);
				
				System.out.print("請輸入y的值：");
				String yInput= scanner.next();
				int y = Integer.parseInt(yInput);
				
				int result = Calculator.powerXY(x, y);
				System.out.printf("%d的%d次方等於%d%n", x, y, result);
				break;
				
			} catch (NumberFormatException e) {
                System.out.println("輸入格式不正確");
                scanner.nextLine();
            } catch (CalException e) {
                System.out.println(e.getMessage());
            }
		}
		scanner.close();
	}
}
