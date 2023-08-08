class Solution {
    public int[] solution(int money) {
        int coffee = money / 5500;
        int change = money % 5500;
        return new int[]{coffee, change};
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(580000));
    }
}

