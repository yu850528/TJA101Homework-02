package hw5;

import java.util.Random;

public class AuthCodeGenerator {

    
    public static String genAuthCode() {
        
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder authCode = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(chars.length());
            authCode.append(chars.charAt(index));
        }

        return authCode.toString();
    }
 
    public static void main(String[] args) {
        System.out.println("本次隨機產生驗證碼為：" );
        System.out.println(genAuthCode());
    }
}

