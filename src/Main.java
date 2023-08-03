class Solution {
    public String solution(String code) {
        String answer = "";
//        boolean mode = false;
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if(mode == 0){
                if(code.charAt(i) != '1'){
                    if (i % 2 ==0 ){
                        answer += code.charAt(i);
                    }
                }else{
                    mode = 1;
                }
            }else {
                if(code.charAt(i) != '1'){
                    if (i % 2 ==1){
                        answer += code.charAt(i);
                    }
                }else{
                    mode = 0;
                }

            }

        }
        if(answer.isEmpty()){
            return "EMPTY";
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

