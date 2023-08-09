class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (char a : letter.toCharArray()) {
            answer = my_string.replace(String.valueOf(a), "");
        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}

