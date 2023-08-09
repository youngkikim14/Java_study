class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strings = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            strings[i] = Character.toString(my_string.charAt(i));
        }
        for (String string : strings) {
            answer += string.repeat(n);
            }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}

