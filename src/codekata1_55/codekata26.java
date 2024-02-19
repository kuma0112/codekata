package codekata1_55;

public class codekata26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < signs.length; i++) {
            if(signs[i] == true){
                sum1 += absolutes[i];
            }else{
                sum2 += absolutes[i];
            }
        }
        return answer = sum1 - sum2;
    }
}
