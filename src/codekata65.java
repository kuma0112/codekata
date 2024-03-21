public class codekata65 {
    public int solution(String s) {
        int answer = 0;
        // 반복문을 사용하여 문자열 s를 처음부터 끝까지 탐색
        while (!s.isEmpty()) {
            // 1. String의 첫 글자를 x로 둔다.
            char x = s.charAt(0);
            int countX = 0; // x 글자의 수
            int countY = 0; // x가 아닌 글자의 수

            // 2. s를 처음부터 끝까지 탐색하면서 x와 x가 아닌 글자의 수를 센다.
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countY++;
                }

                // 3. 두 횟수가 같아지는 순간 문자열을 분리하고, answer를 증가시킨다.
                if (countX == countY) {
                    // 분리한 문자열을 제외한 나머지 부분
                    s = s.substring(i + 1);
                    answer++;
                    break; // 다음 문자열로 넘어간다
                }
            }

            // 문자열의 끝에 도달했지만, 두 횟수가 다른 경우 처리
            // 이 경우에는 남은 문자열을 한 덩어리로 처리하고 반복문을 종료한다.
            if (countX != countY) {
                answer++;
                break;
            }
        }

        return answer;
    }
}
