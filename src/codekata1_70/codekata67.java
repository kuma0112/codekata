package codekata1_70;

public class codekata67 {
    public static String solution(String s, String skip, int index) {
        // 1. answer는 stringbuilder로 구성
        StringBuilder answer = new StringBuilder();
        // 2. skip은 char 배열로 변환
        char[] skipArray = skip.toCharArray();

        // 3. s의 길이만큼 for문 돌면서 s 문자 하나하나씩 인덱스만큼 더할 예정
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int moveCount = 0;

            // 0에서 index만큼 1씩 더할 예정. 만약 1씩 더한 값이 skip 문자와 같으면 1이 더해지지 않음
            while (moveCount < index) {
                currentChar = currentChar == 'z' ? 'a' : (char) (currentChar + 1);
                if (!new String(skipArray).contains(String.valueOf(currentChar))) {
                    moveCount++;
                }
            }
            answer.append(currentChar); // 최종 문자를 결과에 추가
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        solution(s, skip, index);
    }
}


