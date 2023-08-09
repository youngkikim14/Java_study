class Solution {
    public String solution(int age) {
        String answer = "";
        String result = Integer.toString(age);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0'){
                answer += "a";
            } else if (result.charAt(i) == '1'){
                answer += "b";
            } else if (result.charAt(i) == '2'){
                answer += "c";
            } else if (result.charAt(i) == '3'){
                answer += "d";
            } else if (result.charAt(i) == '4'){
                answer += "e";
            } else if (result.charAt(i) == '5'){
                answer += "f";
            } else if (result.charAt(i) == '6'){
                answer += "g";
            } else if (result.charAt(i) == '7'){
                answer += "h";
            } else if (result.charAt(i) == '8'){
                answer += "i";
            } else if (result.charAt(i) == '9'){
                answer += "j";
            }
        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}

