import java.util.*;
public class codekata13 {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }
        return answer;
    }
}
