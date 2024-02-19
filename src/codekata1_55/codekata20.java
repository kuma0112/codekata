package codekata1_55;

public class codekata20 {
    public long solution(long n) {
        long answer = 0;
        String strNumber = n + "";
        long[] numArray = new long[strNumber.length()];
        for (int i = 0; i < strNumber.length(); i++){
            numArray[i] = strNumber.charAt(i)-'0';
        }

        long temp = 0;
        for (int i = 0; i <numArray.length ; i++) {
            for (int j = i+1; j<numArray.length; j++){
                if(numArray[i]<numArray[j]){
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        for (long a : numArray){
            answer = answer * 10 + a;
        }
        return answer;
    }
}
