package codekata1_70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codekata48 {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        // 1. commands 의 []마다 들어 있는 원소값을 구한다. i, j, k
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];

            // 2. ArrayList타입 cutArray를 새로 생성한 후, array를 i~j까지 잘라 넣는다.
            List<Integer> cutArray = new ArrayList<>();
            for (int d = i - 1; d <= j - 1; d++) {
                cutArray.add(array[d]);
            }

            // 3. 자른 cutArray를 숫자순으로 정렬한다.
            Collections.sort(cutArray);
            // 4. answer에 cutArray의 인덱스값 k-1을 집어넣는다.
            answer.add(cutArray.get(k - 1));
        }
        return answer;
    }
}


