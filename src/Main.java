import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] result = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            result[i] = Character.toString(my_string.charAt(i));
        }
        for (int i = my_string.length()-1; i >= 0; i--) {
            answer += result[i];
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

