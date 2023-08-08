class Solution {
    public int solution(int price) {
        int answer = 0;
        double discount = 0;
        if (price >= 100000 && price < 300000){
            discount = price * 0.05;
        } else if (price >= 300000 && price < 500000){
            discount = price * 0.1;
        } else if (price >= 500000){
            discount = price * 0.2;
        } else {
            return price;
        }
        return (int)(price-discount);
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(580000));
    }
}

