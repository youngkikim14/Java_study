import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if (n % i ==0){
                result.add(i);
            }
        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("a"));
        }
}


