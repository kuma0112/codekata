package codekata1_70;

import java.util.ArrayList;
import java.util.List;

public class codekata59 {
    public int solution(int n, int m, int[] section) {
    /**
     * 길이가 n미터인 벽
     * 벽을 1미터씩 n개로 나눠서 색칠할 예정. 각 구역에 1~n 이름 붙임
     * 롤러 길이 m미터. 구역을 꽉 채워서 칠할 때 1번 칠했다고 함.
     * 한 구역에 여러 번 칠하기 ok
     * 칠해야 할 구역 아닌 곳에 칠하기 ok
     * 칠해야 할 구역은 한 번은 칠해야 함
     * 롤러로 페인트칠 하는 횟수 최소화 필요
     * 정수n, 정수m, 다시 칠해야 하는 구역이 담긴 배열 section(1~n 중 몇 개)
     * 페인트칠 최소 횟수는?
     *
     *  주어진 구간(section)에 대해 특정 길이(m)만큼의 구간을 최소한으로 칠해서 전체 범위(n)를 커버하는 문제
     */
        int answer = 0;

        // 1. int section 배열을 arrayList로 바꿈
        List<Integer> sections = new ArrayList<>();
        for (int i : section) sections.add(i);

        // 2. section이 빌 때까지
        while(!sections.isEmpty()) {
            int s = sections.get(0);
            // 문제 조건에 맞게 칠하기
            for (Integer i = s; i < s + m && i <= n; i++) {
                sections.remove(i); // 칠한 영역 제거. i가 s+m이면서 <=n 될 때까지의 i들이 제거되면서 sections.get(0)값도 바뀜
            }
            answer++; // 칠한 횟수 증가
        }

        return answer;
    }
}
