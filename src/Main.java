class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] game = rsp.toCharArray();
        for (char a : game) {
            if (a == '0'){
                answer += "5";
            } else if (a == '2'){
                answer += "0";
            } else if (a == '5'){
                answer += "2";
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

