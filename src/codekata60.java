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

        // 2. 약수 개수가 limit을 넘으면 power로 조정.

        // 3. 조정된 arrayList의 모든 값을 모두 더한다.
        return answer;
    }

}
