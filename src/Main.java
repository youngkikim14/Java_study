import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Math.abs(n - array[i]);
        }
        int min = result[0];
        int minIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i] < min) {
                min = result[i];
                minIndex = i;
            }
        }
        return array[minIndex];
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
        }
}


