import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codekata53 {
        public List<Integer> solution(int k, int[] score) {
            List<Integer> answer = new ArrayList<>();
            List<Integer> array = new ArrayList<>();

            for (int index = 0; index < score.length; index++) {
                // 1. 0, 0~1, 0~2 이런 식으로 더해가며 가수 점수를 array에 추가
                array.add(score[index]);

                // 2. 만약 오늘의 날짜가 k보다 클 경우, 가장 낮은 점수를 제거 (k일 이후부터는 array의 크기가 k로 유지되어야 하기 때문)
                // Collections.binarySearch는 정렬된 리스트에서 특정 값을 찾는 데 사용되며, 찾은 경우 해당 요소의 인덱스를 반환하고 찾지 못한 경우 음수를 반환한다.
                // 다시 말해, scroe[index-k]를 가장 최소값이라고 생각하고 이것이 현재의 array에서 발견되면 삭제한다.
                if (index >= k) {
                    array.remove(Collections.binarySearch(array, score[index - k]));
                }

                answer.add(array.get(k - 1));

                Collections.sort(array);
            }
            return answer;
    }
}
