public class codekata40 {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        while(n != 0){
            s += n %3;
            n = n / 3;
        }

        answer = Integer.parseInt(s, 3);
        return answer;
    }
}

