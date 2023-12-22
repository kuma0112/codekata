public class codekata12 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        return answer = sum / arr.length;
    }
}
