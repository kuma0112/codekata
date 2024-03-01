public class codekata61 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; // 1. 최고 순위와 최저 순위를 담을 배열 선언

        int matchCount = 0; // 일치하는 번호의 개수를 카운트하기 위한 변수 초기화
        int zeroCount = 0; // 알아볼 수 없는 번호(0)의 개수를 카운트하기 위한 변수 초기화

        // 2. 민우의 로또 번호와 당첨 번호를 비교하여 일치하는 숫자의 개수를 파악
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCount++; // 알아볼 수 없는 번호(0)의 개수 증가
            } else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        matchCount++; // 일치하는 번호의 개수 증가
                        break;
                    }
                }
            }
        }

        // 3. 일치하는 숫자의 개수와 알아볼 수 없는 번호의 개수를 기반으로 최고 순위와 최저 순위 결정
        // 최고 순위: 일치하는 번호의 개수 + 알아볼 수 없는 번호(0)의 개수
        answer[0] = Math.min(7 - (matchCount + zeroCount), 6);
        // 최저 순위: 일치하는 번호의 개수
        answer[1] = Math.min(7 - matchCount, 6);

        return answer; // 계산된 최고 순위와 최저 순위를 반환
    }
}
