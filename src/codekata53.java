import java.util.ArrayList;
import java.util.List;

public class codekata53 {
    public List<Integer> solution(int k, int[] score) {
        int min = score[0];
        List<Integer> answer = new ArrayList<>();

        // 1. k 길이 만큼의 배열을 만든다.
        // 2. int[] score의 값을 k 배열에 집어넣는다.
        // 3. k 배열의 순서는 계속 유지된다. 가장 작은 값이 인덱스 0번.
        // 4. answer에는 k 인덱스 0번이 들어간다.
        for (int i = 0; i < k; i++){
            if (score[i] < min){
                min = score[i];
            }
        }


        return answer;
    }
}
