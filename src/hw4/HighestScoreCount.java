package hw4;

public class HighestScoreCount {
    public static void main(String[] args) {
        int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70},   
            {37, 75, 77, 89, 64, 75, 70, 95},     
            {100, 70, 79, 90, 75, 70, 79, 90},    
            {77, 95, 70, 89, 60, 75, 85, 89},    
            {98, 70, 89, 90, 75, 90, 89, 90},     
            {90, 80, 100, 75, 50, 20, 99, 75}    
        };
        
        int[] highestCount = new int[8];
        
        // 計算每次考試的最高分
        for (int exam = 0; exam < scores.length; exam++) {
            int maxScore = findMaxScore(scores[exam]);
            
            // 檢查哪位同學獲得最高分
            for (int student = 0; student < scores[exam].length; student++) {
                if (scores[exam][student] == maxScore) {
                    highestCount[student]++;
                }
            }
        }
        
        for (int student = 0; student < highestCount.length; student++) {
            System.out.printf("%d號同學獲得最高分的次數: %d%n", student + 1, highestCount[student]);
        }
    }
    
    // 找出單次考試中的最高分
    public static int findMaxScore(int[] examScores) {
        int max = examScores[0];
        for (int score : examScores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
}
