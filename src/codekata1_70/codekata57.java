package codekata1_70;

import java.util.ArrayList;

public class codekata57 {
    /*
    수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     */

    public ArrayList<Integer> solution(int[] answers) {
        int[] answer = {};

        // 1. 수포자들의 패턴을 파악한다.
        // 1번은 1,2,3,4,5의 반복. 2번은 2,1,2,3,2,4,2,5 반복. 3번은 3,3,1,1,2,2,4,4,5,5 반복. 이를 2차원 배열에 넣으면
        int[][] patterns = {
                {1, 2, 3, 4, 5}, // 1번 수포자의 찍기 패턴
                {2, 1, 2, 3, 2, 4, 2, 5}, // 2번 수포자의 찍기 패턴
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} // 3번 수포자의 찍기 패턴
        };

        // 2. 각 수포자들의 점수를 넣을 배열을 만든다.
        int[] scores = new int[3];

        // 3. pattern을 for 문으로 돌리며 answer와 비교하여, 각 수포자별로 정답을 얼마나 맞췄는지 계산한다.
        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == patterns[i][j % patterns[i].length]) {
                    scores[i]++;
                }
            }
        }

        // 4. Math.max로 가장 높은 점수를 받은 수포자를 찾는다.
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 5. 가장 높은 점수를 받은 수포자의 번호를 리스트에 추가
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
