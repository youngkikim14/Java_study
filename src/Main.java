import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        List<Integer> arrayList = new ArrayList<>();
        Arrays.sort(array);
        for (int j : array) {
            arrayList.add(j);
        }
        for (int i = 1; i < arrayList.size(); i++) {
            if (Collections.frequency(arrayList, arrayList.get(i)) <= Collections.frequency(arrayList, arrayList.get(i-1))){
                answer = arrayList.get(i-1);
            } else if (Collections.frequency(arrayList, arrayList.get(i)) == Collections.frequency(arrayList, arrayList.get(i-1))){
                answer = -1;
            } else if (array.length == 1){
                answer = arrayList.get(0);
            }
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 1, 2, 2}));
    }
}

