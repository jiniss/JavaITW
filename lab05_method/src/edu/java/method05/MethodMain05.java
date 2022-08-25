package edu.java.method05;

public class MethodMain05 {

    public static void main(String[] args) {
        // 메서드 작성 연습

        int[] scores = { 70, 60, 100, 50, 80 };

        int sum = sum(scores);
        System.out.println("총점 = " + sum); // 360

        double avg = mean(scores);
        System.out.println("평균 = " + avg); // 72.0
        
        int max = max(scores);
        System.out.println("최댓값 = " + max); //100
        
        int min = min(scores);
        System.out.println("최솟값 = " + min); //50

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }

    public static double mean(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;   
    }
        double avg = (double)sum / array.length;
        return avg;
}
    
    public static int max(int[] array) {
        int max = array[0];
        for (int n : array) {
            max = (n > max) ? n : max;
        }
        return max;
    }
    
    public static int min(int[] array) {
        int min = array[0];
        for (int n : array) {
            min = (n < min) ? n : min;
        }
        return min;
    }
    

}