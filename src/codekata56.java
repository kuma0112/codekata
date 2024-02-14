public class codekata56 {
    public int solution(int k, int m, int[] scores) {
        // 각 점수별 사과의 수를 저장할 배열
        int[] countPerScore = new int[k + 1];

        // 사과 점수를 세어 countPerScore 배열에 저장
        for (int score : scores) {
            countPerScore[score]++;
        }

        int maxProfit = 0;

        // 가능한 모든 사과 점수에 대해 최대 이익 계산
        for (int p = 1; p <= k; p++) {
            // 현재 점수 p의 사과로 만들 수 있는 상자 수
            int boxes = countPerScore[p] / m;
            // 이 사과 점수로 얻을 수 있는 이익
            int profit = p * m * boxes;

            // 최대 이익 갱신
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
