class Solution {
    public String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();
        if (code == 1) return cipher;
        for (int i = code-1; i < cipher.length(); i+=code) {
            result.append(cipher.charAt(i));
        }
        return result.toString();
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("dfjardstddetckdaccccdegk", 4));
        }
}


