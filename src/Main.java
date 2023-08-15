class Solution {
    public int solution(int n) {
        int answer = 1;
        int result = 1;
        while (answer < 10){
            result *= answer;
            if (result == n){
                break;
            } else if (result  > n){
                answer--;
                break;
            }
            answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

