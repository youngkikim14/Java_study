class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 0;
        int soldier = 0;
        int worker = 0;
        while (hp != 0){
            general = hp / 5;
            hp -= general * 5;
            soldier = hp / 3;
            hp -= soldier * 3;
            worker = hp;
            hp -= worker;
            answer = general + soldier + worker;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

