import java.util.Arrays;

class Solution {
    public String solution(String s) {
        if (s.length() == 1){
            return s;
        }
        StringBuilder answer = new StringBuilder();
        char[] result = s.toCharArray();
        Arrays.sort(result);
        // aaabbcdd
        for (int i = 1; i < result.length-1; i++) {
            if(result[i-1] != result[i] && result[i] != result[i+1]){
                answer.append(result[i]);
            }
        }
        if (result[result.length-2] != result[result.length-1]){
            answer.append(result[result.length - 1]);
        }
        if (result[0] != result[1]){
            answer.append(result[0]);
        }
        char[] a = answer.toString().toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("a"));
        }
}


