package codekata1_70;

public class codekata60 {

    /**
     * 1~number 까지의 기사단원들이 있음.
     * 각 기사는 약수 개수에 해당하는 공격력을 지닌 무기 구매.
     * 예 ) 15번 기사는 약수 개수 4개. 따라서 공격력 4인 무기 구매.
     *
     * 이때, limit이 3이고 limit을 초과한 기사가 사용할 무기 공격력(power)이 2라면, 결국 2 구매.
     * 공격력만큼 철 필요 -> 모든 철의 무게 계산
     */

    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 1. 1~number 까지 각 숫자의 약수 개수를 구한다. 이후 arrayList에 저장.
        for (int i = 1; i <= number; i++){
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    if (i / j == j) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            // 2. 약수 개수가 limit을 넘으면 power로 조정.
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
}
