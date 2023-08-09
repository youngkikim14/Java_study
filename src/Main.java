class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int even = 0;
        int odd = 0;
        for (int a : num_list) {
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        answer = new int[]{even, odd};
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}

