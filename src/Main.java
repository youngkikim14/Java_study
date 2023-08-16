import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> result = new HashSet<>();
        int a = 0;
        for (int i = 2; i < n; i++) {
            if (n % i ==0){
                a = n / i;
                while (a % 2 == 0){
                    a /= 2;
                    result.add(a);
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

