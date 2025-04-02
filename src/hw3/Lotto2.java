package hw3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Lotto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> availableNumbers = new ArrayList<>();

        // 初始化可選號碼
        for (int i = 1; i <= 49; i++) {
            availableNumbers.add(i);
        }

        // 輸入不想要的數字
        System.out.print("請輸入討厭的數字？(1~9)");
        int exclude = scanner.nextInt();

        // 檢查輸入是否有效，並排除包含不想要的數字的號碼
        if (exclude >= 0 && exclude <= 9) {
            availableNumbers.removeIf(num -> String.valueOf(num).contains(String.valueOf(exclude)));
        } 

        // 顯示可選號碼
        Collections.sort(availableNumbers);
        System.out.println(); // 換行
        for (int i = 0; i < availableNumbers.size(); i++) {
            System.out.print(availableNumbers.get(i) + "\t");
            if ((i + 1) % 7 == 0) {
                System.out.println(); // 換行
            }
        }

        // 顯示總共有多少數字可選
        System.out.println("\n總共有 " + availableNumbers.size() + " 數字可選");
        
        
        ArrayList<Integer> chosen = new ArrayList<>();
        Random random = new Random();
        while (chosen.size() < 6) {
            int number = availableNumbers.get(random.nextInt(availableNumbers.size()));
            if (!chosen.contains(number)) {
                chosen.add(number);
            }
        }

        // 排序並顯示結果
        Collections.sort(chosen);
        System.out.println("選出的號碼是：" + chosen);
        scanner.close();
    }
}