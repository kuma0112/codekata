package codekata1_70;

public class codekata21 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = x + "";
        for (int i = 0; i<str.length(); i++){
            sum += str.charAt(i)-'0';
        }
        if (x%sum==0){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
