class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
            return sum / (double) numbers.length;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

