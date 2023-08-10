class Solution {
    public int solution(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= share; i++) {
            result = result * (balls - (share - i)) / i;
        }

        return (int)result;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

