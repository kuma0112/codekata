public class codekata52 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        if (n < a) {
            // 보유 중인 빈 병이 a개 미만이면 콜라가 0
            return 0;
        }

        int totalCola = 0;
        int currentBottles = n;

        while (currentBottles >= a) {
            // 빈 병 a개를 가져다주면 콜라 b병을 받음
            int exchangedCola = currentBottles / a * b;
            totalCola += exchangedCola;

            // 새로 받은 콜라의 빈 병으로 교체
            currentBottles = exchangedCola + (currentBottles % a);
        }

        return totalCola;
    }

        // 2 : 1 = 20 : 10
        // a : b = n : n / a
}
