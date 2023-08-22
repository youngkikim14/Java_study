class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        // 1. 받은 정수를 2진수 변환하여 담을 변수 선언
        String [] binary1 = new String[arr1.length];
        String [] binary2 = new String[arr2.length];
        String [] answer = new String[n];
        for( int i = 0 ; i<n ;i ++){
            String s = String.valueOf(n);
            binary1[i]= String.format("%" + n + "s" ,Integer.toBinaryString(arr1[i])).replace(" ","0");
            binary2[i]= String.format("%" + n + "s" ,Integer.toBinaryString(arr2[i])).replace(" ","0");
        }
        for( int i = 0 ; i<n ;i ++){
            String result = "";
            for(int j = 0 ; j < n; j ++){
                if(binary1[i].charAt(j)=='1' || binary2[i].charAt(j)=='1'){
                    result += "#";
                }else {
                    result += " ";
                }
            }
            answer[i] = result;
        }
//        System.out.println("binary1 = " + Arrays.toString(binary1));
//        System.out.println("result = " + Arrays.toString(answer));
//        System.out.println("binary2 = " + Arrays.toString(binary2));
        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution());
        }
}


