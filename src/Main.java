import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] result = dartResult.split("(?=(\\d))");
        List<String> result1 = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() == 1){
                result1.add(result[i] + result[i + 1]);
                result[i+1] = "null";
            } else if(result[i].equals("null")){
                String oh = "happy!";
            } else result1.add(result[i]);
        }
//        System.out.println(Arrays.toString(result1.toArray()));


        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("1S*2T*3S"));
        }
}


