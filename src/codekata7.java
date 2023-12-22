public class codekata7 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double num = (double) num1 / num2;
        answer = (int)(num * 1000);
        return answer;
    }
}
