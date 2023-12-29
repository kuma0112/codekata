package codekata1_40;

public class codekata36 {
    public boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        if(s.length() == 4 || s.length()==6){
            for (int i = 0; i < s.length() ; i++) {
                if(s.charAt(i)>=48 && s.charAt(i)<=57){
                    count++;
                }
            }
            if (count == s.length()) {
                answer = true;
            }else {
                answer =false;
            }
        }
        return answer;
    }
}
