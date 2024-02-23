import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     */
        int answer = 0;

        // 1. section 오름차순 정렬
        Arrays.sort(section);

        // 2. 연속된 구역을 저장할 arrayList를 만든다.
        List<int[]> arr = new ArrayList<>();
        // 현재 연속된 구역의 시작점
        int startSection = section[0];
        // 현재 연속된 구역의 끝점
        int endSection = startSection;

        // 정렬된 구역 배열을 순회
        for (int i = 1; i < section.length; i++) {
            // 현재 구역
            int currentSection = section[i];
            // 이전 구역과 현재 구역의 차이가 1이면, 연속된 구역임
            if (currentSection == endSection + 1) {
                endSection = currentSection;
            } else {
                // 연속이 끊기면 현재까지의 연속된 구역을 저장
                arr.add(new int[]{startSection, endSection});
                // 새로운 연속된 구역의 시작점을 현재 구역으로 설정
                startSection = currentSection;
                endSection = currentSection;
            }
        }
        // 마지막 연속된 구역 추가
        arr.add(new int[]{startSection, endSection});


        return answer;
    }
}
