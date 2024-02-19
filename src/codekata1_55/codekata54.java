package codekata1_55;

public class codekata54 {
    public String solution(int a, int b) {
        // 1. 각 월의 일수를 배열로 저장한다.
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 2. 주어진 월(a)과 일(b)을 이용하여 해당 날짜까지의 총 일수를 계산한다.
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b - 1;

        // 3. 2016년 1월 1일은 금요일이므로 금요일부터 시작하여 요일을 계산한다.
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        // 4. 계산된 요일을 반환한다.
        return daysOfWeek[totalDays % 7];
    }
}
