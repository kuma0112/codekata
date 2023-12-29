package codekata1_40;

public class codekata39 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int minMult = 0;
        int maxDiv = 0;
        if(n>m){
            int l = n;
            n = m;
            m = l;
        }
        int i = 1;
        while ( i <= n) {
            if(n%i == 0 && m%i == 0){
                maxDiv = i;
            }
            i++;
        }
        minMult = n*m/maxDiv;
        answer[0] = maxDiv;
        answer[1] = minMult;

        return answer;
    }
}
