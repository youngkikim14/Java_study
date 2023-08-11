class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int a = 0;
        int i = 0;
        while (a < k){
            if (i == numbers.length){
                i = 0;
            } else if (i == numbers.length+1){
                i = 1;
            }
            answer = numbers[i];
            i+=2;
            a++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 2, 3};
        System.out.println(solution.solution(a, 3));
    }
}

