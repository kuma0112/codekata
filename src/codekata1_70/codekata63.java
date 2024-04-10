package codekata1_70;

import java.util.*;

public class codekata63 {
    public String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> commonCounts = new HashMap<>();

        for (char ch : X.toCharArray()) {
            countX.put(ch, countX.getOrDefault(ch, 0) + 1);
        }

        for (char ch : Y.toCharArray()) {
            if (countX.containsKey(ch) && countX.get(ch) > 0) {
                commonCounts.put(ch, commonCounts.getOrDefault(ch, 0) + 1);
                countX.put(ch, countX.get(ch) - 1); // 중복 방지
            }
        }

        if (commonCounts.isEmpty()) {
            return "-1";
        }

        // 공통 문자들을 정렬하여 결과 문자열 생성
        ArrayList<Character> commonChars = new ArrayList<>(commonCounts.keySet());
        Collections.sort(commonChars, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (char ch : commonChars) {
            int count = commonCounts.get(ch);
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        String result = sb.toString();
        if (result.replaceAll("0", "").isEmpty()) {
            return "0";
        }

        return result;
    }
}
