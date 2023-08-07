class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        if (n > 3) {
            for (int i = 1; i < 100; i++) {
                if ((n * i) % pizza == 0) {
                    answer = (n * i) / pizza;
                    break;
                }
            }
        } else {
            answer = 1;
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5));
    }
}

