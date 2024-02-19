package codekata1_55;

import java.util.*;
public class codekata25 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int a: arr){
            if (a % divisor == 0){
                array.add(a);
            }
        }

        if (array.isEmpty()){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
