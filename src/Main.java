class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("a"));
        }
}


