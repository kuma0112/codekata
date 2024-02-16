import java.util.Arrays;

public class codekata56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 1. 사과를 점수대로 오름차순으로 정렬한다.
        Arrays.sort(score);
        // 2. m개씩 빼서 사과 상자에 담는다.
        for(int i = score.length - m; i >= 0; i -= m)
            // 3. answer에는 사과의 최소값과 m개를 곱한 값들을 더해 넣는다.
            answer += score[i] * m;
        return answer;
    }
}
