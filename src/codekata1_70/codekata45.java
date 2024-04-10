package codekata1_70;

public class codekata45 {
    public String solution(String s, int n) {
        String answer = "";

        // 1. 내부 문자열을 변환할 수 있는 가변 객체인 StringBuilder 객체를 만든다.
        StringBuilder stringBuilder = new StringBuilder();
        // 2. 주어진 문자열 s를 char array로 변환한다.
        char[] array = s.toCharArray();
        // 3. char array인 array를 향상된 for문으로 한 글자씩 살펴본다.
        for (char c : array){
             // 4. char c 가 대문자일 경우, c - 'A' 하여 A~Z를 0~25로 매핑한다.
            // 5. 움직여야 하는 거리 n을 더한 후, 26(알파벳 총 개수)로 나눈다. (c - 'A' + n)이 문자열 범위를 벗어나는 경우를 처리하기 위함.
            // 6. 이후 다시 'A'를 더해주어 0~25를 다시 'A'~'Z' 문자로 나타낸다.
            if(Character.isUpperCase(c)){
                c = (char) ((c- 'A' + n) % 26 +'A');
                // 7. 소문자도 똑같이 진행한다.
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            }
            // 8. 가변 문자열에 각 문자를 더한다.
            stringBuilder.append(c);
        }

        // 9. 가변 객체를 String으로 변환한다.
        answer = stringBuilder.toString();
        return answer;
    }
}
