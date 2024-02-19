package codekata1_55;

public class codekata10 {
    public double solution(int[] numbers) {
        double sum = 0;
        double answer = 0;

        for (int i = 0; i<numbers.length ; i++){
            sum += numbers[i];
            answer = sum / numbers.length;
        }
        return answer; // 리턴타입이 더블이면
    }
}
