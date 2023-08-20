class Solution {
    public int solution(String my_string) {
        String[] result = my_string.split(" ");
        int answer = Integer.parseInt(result[0]);
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("+")){
                answer += Integer.parseInt(result[i + 1]);
            } else if (result[i].equals("-")){
                answer -= Integer.parseInt(result[i + 1]);
            }
        }
        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("33+4+10"));
        }
}


