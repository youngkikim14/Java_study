import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] result = dartResult.split("(?=(\\d))");
        List<String> result1 = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() == 1){
                result1.add(result[i] + result[i + 1]);
                result[i+1] = "null";
            } else if(result[i].equals("null")){
                String oh = "happy!";
            } else result1.add(result[i]);
        }
        System.out.println(Arrays.toString(result1.toArray()));
        String [][] result2 = new String[3][];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < result2.length; j++) {

            }
        }
        return answer;
    }
//public static int solution(String dartResult) {
//    int answer = 0;
//    int[] anwer1 = new int[3];
//    //문자열을 나눈다
//    String[] result = dartResult.split("(?=(\\d))");
//    Character[][] secondArr = new Character[result.length][];
//    for (int i = 0; i < result.length; i++) {
//        secondArr[i] = new Character[result[i].length()];
//        for (int j = 0; j < result[i].length(); j++) {
//            secondArr[i][j] = result[i].charAt(j);
//        }
//    }
//    for (int i = 0; i < result.length; i++) {
//        for (int j = 0; j < secondArr[i].length; j++) {
//            double a = 0;
//            a = (int) (secondArr[i][0] - '0');
//            if (secondArr[i][0] == '1' && secondArr[i][1] == '0') {
//                a = 10;
//                j++;
//            }
//            if (secondArr[i][j] == 'S') {
//                a = Math.pow(a, 1);
//                anwer1[i] += a;
//            } else if (secondArr[i][j] == 'D') {
//                a = Math.pow(a, 2);
//                anwer1[i] += a;
//            } else if (secondArr[i][j] == 'T') {
//                a = Math.pow(a, 3);
//                anwer1[i] += a;
//            } else if (secondArr[i][j] == '*') {
//                anwer1[i] = anwer1[i] * 2;
//                if (i != 0) {
//                    anwer1[i - 1] = anwer1[i - 1] * 2;
//                }
//            } else if (secondArr[i][j] == '#') {
//                anwer1[i] = anwer1[i] * (-1);
//            }
//        }
//    }
//    System.out.println(Arrays.toString(result));
//    System.out.println(Arrays.toString(anwer1));
//    System.out.println(Arrays.stream(anwer1).sum());
////        System.out.println(Arrays.deepToString(secondArr));
//    return Arrays.stream(anwer1).sum();
//    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("10S*2T*10S"));
        }
}


