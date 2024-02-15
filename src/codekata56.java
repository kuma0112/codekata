import java.util.Arrays;

public class codekata56 {
    public int solution(int k, int m, int[] scores) {
        // 1. 사과 점수를 오름차순으로 정렬한다.
        Arrays.sort(scores);
        // 2. 총 사과 개수를 세서 n에 저장한다.
        int n = scores.length;
        int maxProfit = 0;

        // 상자당 사과 개수가 전체 사과 개수보다 많다면, 판매할 수 있는 사과 상자는 없다.
        if (m>n) return 0;

        // 그게 아니라면, 오름차순으로 m개씩 잘라서 사과 상자를 만든다.
        // n-m 하는 이유는 총 사과 개수에서 m개씩 빼낼 거기 때문
        for (int i = 0; i <= n-m; i++){
            // 그렇게 자른 m개의 사과 중 최소 점수를 찾는다.
            int minScore = scores[i];
            // 한 상자 가격 = 가장 낮은 사과 점수 * 상자당 사과 개수
            int price = minScore * m;
            // 최대 이익
            maxProfit = Math.max(maxProfit, price);
        }

        return maxProfit;
    }
}
