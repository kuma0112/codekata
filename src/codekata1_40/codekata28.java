package codekata1_40;

public class codekata28 {
    public int solution(int[] numbers) {
        int answer = -1;
        int j = 0;
        for(int i =0; i < numbers.length; i++){
            j += numbers[i];
        }

        return 45 - j;
    }
}
