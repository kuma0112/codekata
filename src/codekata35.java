public class codekata35 {
    public long solution(long price, long money, long count) {
        long answer = -1;
        long countSum = 0;
        long userMoneySum = 0;
        for (long i = 1; i <= count; i++) {
            countSum += i;
            userMoneySum = countSum * price;
        }
        if (money > userMoneySum) {
            answer = 0;
        } else {
            answer = userMoneySum - money;
        }
        return answer;
    }
}
