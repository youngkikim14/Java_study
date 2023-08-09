
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = 1;
            for (int k : emergency) {
                if (emergency[i] < k) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

