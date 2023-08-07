class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for (int i = 1; i < 100; i++) {
            if ((slice * i) / n >= 1){
                return i;
            }
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2,1));
    }
}

