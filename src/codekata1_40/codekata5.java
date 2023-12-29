package codekata1_40;

public class codekata5 {
    public int solution(int num1, int num2) {
        int answer = 0;

        if (num1 == num2)
            answer = 1;

        if (num1 != num2)
            answer = -1;

        return answer;
    }
}
