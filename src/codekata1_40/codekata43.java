package codekata1_40;

public class codekata43 {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long num = Long.parseLong(p);
        for (int i = 0; i <= t.length()-len; i++) {
            if(Long.parseLong(t.substring(i, i + len)) <= num){
                answer++;
            }
        }
        return answer;
    }
}
