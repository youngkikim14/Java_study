import java.util.ArrayList;

class Solution {
    public Integer[] solution(int n) {
//        int[] answer = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i%2 == 1){
                result.add(i);
            }
        }
        return result.toArray(result.toArray(new Integer[0]));
    }
}


public class Main {
    public static void main(String[] args) {
    }
}

