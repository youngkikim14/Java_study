import java.util.Arrays;

class Solution {
    public int solution(String s) {
        String[] a = s.split(" ");
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("Z")){
                a[i - 1] = "0";
                a[i] = "0";
            }
        }
        for (int i = 0; i < a.length; i++) {
            result[i] = Integer.parseInt(a[i]);
        }
        return Arrays.stream(result).sum();
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

