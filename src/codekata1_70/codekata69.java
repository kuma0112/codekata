package codekata1_70;

import java.util.HashMap;

public class codekata69 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        solution(survey, choices);
    }
    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        // 1. MBTI 해시맵을 생성 후 초기화한다.
        HashMap<String, Integer> MBTI = new HashMap<>();
        MBTI.put("R",0);
        MBTI.put("C",0);
        MBTI.put("J",0);
        MBTI.put("A",0);

        MBTI.put("T",0);
        MBTI.put("F",0);
        MBTI.put("M",0);
        MBTI.put("N",0);

        // 2. 점수표 해시맵을 생성 후 초기화한다.
        HashMap<Integer, Integer> NumberBoard = new HashMap<>();
        NumberBoard.put(1, 3);
        NumberBoard.put(2, 2);
        NumberBoard.put(3, 1);
        NumberBoard.put(4, 0);
        NumberBoard.put(5, 1);
        NumberBoard.put(6, 2);
        NumberBoard.put(7, 3);

        for (int i = 0; i< survey.length; i++) {
            String s = survey[i];
            int n = choices[i];

            String a = s.substring(0,1);
            String b = s.substring(1);

            if (n>=5) {
                MBTI.replace(b, MBTI.get(b) + NumberBoard.get(n));
            }

            if (n<=3){
                MBTI.replace(a, MBTI.get(a) + NumberBoard.get(n));
            }
        }

        answer += MBTI.get("R") >= MBTI.get("T") ? "R" : "T";
        answer += MBTI.get("C") >= MBTI.get("F") ? "C" : "F";
        answer += MBTI.get("J") >= MBTI.get("M") ? "J" : "M";
        answer += MBTI.get("A") >= MBTI.get("N") ? "A" : "N";

        return answer;
    }
}
