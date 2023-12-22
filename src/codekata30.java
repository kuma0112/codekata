public class codekata30 {
    public String solution(String s) {
        String answer = "";
        if (s.length()%2 == 0){
            answer += "" + s.charAt(s.length()/2-1)+s.charAt(s.length()/2);
            // 반드시 "" 앞에 붙여야 함. 그러지 않으면 char 숫자값이 더해진 다음 String에 감싸여 출력됨.
        } else {
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}
