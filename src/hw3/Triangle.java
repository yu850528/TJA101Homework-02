package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] side = new int[3];
		System.out.print("請輸入三個整數：");
		
		side[0] = sc.nextInt();
		side[1] = sc.nextInt();
		side[2] = sc.nextInt();
		Arrays.sort(side);
		sc.close();
		int a = side[0], b = side[1], c = side[2];
		System.out.println(a+" "+b+" "+c);
		if (a + b <= c) {
            System.out.println("不是三角形");
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("直角三角形");
        } else if (a == b && b == c) {
            System.out.println("正三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("其它三角形");
        }
		
	}

}
