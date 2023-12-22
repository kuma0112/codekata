public class codekata19 {
    public long solution(long n) {
        long answer = -1;
        for (long i = 1; i <= n; i++) {
            if (i*i == n) {
                answer = (long)(i + 1)*(i + 1);
                break;
            }
        } return answer;
    }
}
