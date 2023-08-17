import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
        }
}


