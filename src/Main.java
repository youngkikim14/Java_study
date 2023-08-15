import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(String my_string) {
        String number = my_string.replaceAll("[a-z,A-Z]", "");
//        int result = Integer.parseInt(number);
//        int[] answer = Arrays.stream(Stream.of(number.split(""))
//                .mapToInt(Integer::parseInt)
//                .toArray()).sum();
//        Arrays.sort(answer);
        return Arrays.stream(Stream.of(number.split(""))
                .mapToInt(Integer::parseInt)
                .toArray()).sum();
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

