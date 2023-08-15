import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        String number = my_string.replaceAll("[a-z]", "");
        int result = Integer.parseInt(number);
        int[] answer = Stream.of(String.valueOf(result).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(answer);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

