package codekata1_70;

public class codekata32 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i == j) {
                    answer += (a[i] * b[j]);
                }
            }
        } return answer;
    }
}
