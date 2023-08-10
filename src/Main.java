import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] result = letter.split(" ");
        Map<String, String> m = new HashMap<>();
        m.put(".-","a");m.put("-...","b");m.put("-.-.","c");m.put("-..","d");m.put(".","e");m.put("..-.","f");m.put("--.","g");m.put("....","h");m.put("..","i");m.put(".---","j");m.put("-.-","k");m.put(".-..","l");m.put("--","m");m.put("-.","n");m.put("---","o");m.put(".--.","p");m.put("--.-","q");m.put(".-.","r");m.put("...","s");m.put("-","t");m.put("..-","u");m.put("...-","v");m.put(".--","w");m.put("-..-","x");m.put("-.--","y");m.put("--..","z");
        for (String a : result) {
            answer += m.get(a);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

