import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public static int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        List<Integer> list = Arrays.stream(stages).boxed().collect(Collectors.toList());
        int[] c = new int [N];
        int[] answer = new int[N];
        Map<Integer,Float> result= new HashMap<>();
        int a = stages.length;
        for(int i = 0 ; i < N; i++){
            c[i] = Collections.frequency(list,i+1);
//            System.out.println(c.length);
            if(a==0){
                result.put((i+1), 0.0F);
            }else{
                result.put((i+1), ((float) c[i] / a));
            }
            // System.out.println("실패율" + result.values());
            a = a - c[i];
        }
        Map<Integer, Float> sortedByValueDesc = result.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Float>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int i =0;
        for (int b : sortedByValueDesc.keySet()){
            answer[i]= b;
            // System.out.println(answer[i]);
            i++;
        }
        return answer;
    }
}

    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution(10001, 0));
        }
}


