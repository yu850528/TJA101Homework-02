package hw5;

import java.util.Random;

public class RandomAverage {
    public static void main(String[] args) {
        randAvg();
    }

    public static void randAvg() {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101); // 0~100
            sum += numbers[i];
        }

        int average = sum / numbers.length;// 計算平均值

        System.out.println("本次亂數結果：");
        for (int num : numbers) {
            System.out.print(num + "  ");
        }
        System.out.println(); 
        System.out.println(average);
    }
}
