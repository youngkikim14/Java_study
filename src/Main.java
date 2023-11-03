class Birthday {
    public String congratulation (Boolean love) {
        if (love == true){
            String[] word = {"영기야", "사랑해", "생일", "축하해"};
            String answer = "";
            for ( int i = 0; i < word.length; i++){
                answer += word[i] + " ";
            }
            return answer.trim();
        } else {
            return null;
        }
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution());
        }
}


