class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int result = 0;
        int total = 0;
        while (num % 10 != 0){
            result = num % 10;
            num = num / 10;
            total++;
            if (result == k){
                answer = total;
            }
        }
        return answer == 0 ? -1 : total - answer+1;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution(10001, 0));
        }
}


