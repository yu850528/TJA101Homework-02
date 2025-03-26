package hw2;

public class Lotto {
	public static void main(String[] args) {
		int count = 0; 
        for (int i = 1; i <= 49; i++) {
            if (i % 10 != 4 && i / 10 != 4) {
                System.out.print(i + " ");
                count++;
            }
        
        
			
		}
        System.out.println("\n總共有 " + count + " 個數字。");

	}

}
