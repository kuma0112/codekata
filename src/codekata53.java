import java.util.PriorityQueue;

public class codekata53 {
    public int[] solution(int k, int[] score) {
        // 1. answer 배열 초기화
        int[] answer = new int[score.length];

        // 2. 우선순위 큐를 사용해본다.
        // 최하위 점수에 쉽게 접근할 수 있으며 새로운 점수를 추가하거나 최하위 점수를 제거하는 작업이 쉽게 가능하다.
        // 먼저, 우선순위 큐를 초기화한다.
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int day = 0; day < score.length; day++){
            // 3. 현재 가수의 점수를 우선순위 큐에 추가한다.
            hallOfFame.add(score[day]);

            // 4. k일 이후부터는 큐의 size를 k로 유지해야 하므로,
            // 우선순위 큐의 크기가 k를 초과하면 가장 낮은 점수를 제거한다.
            if (day >= k) {
                hallOfFame.poll();
            }

            // 5. 현재 명예의 전당 배열에 최하위 점수를 저장
            answer[day] = hallOfFame.peek();
        }
        return answer;
    }
}
