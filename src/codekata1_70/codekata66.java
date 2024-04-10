package codekata1_70;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class codekata66 {
    public int[] solution(String[] keymap, String[] targets) {
        // 1. 배열 answer의 길이는 배열 targets의 길이와 같다.
        int[] answer = new int[targets.length];

        //2. character를 key로, integer list를 value로 가지는 hashmap을 구성한다.
        Map<Character, List<Integer>> charMap = new HashMap<>();

        // 3. for문으로 keymap의 모든 인덱스, 그 안에 든 문자들을 돌면서
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                // 이미 해당 문자에 대한 리스트가 있다면 가져오고, 없다면 새 리스트를 생성
                List<Integer> presses = charMap.getOrDefault(c, new ArrayList<>());
                // 리스트에는 몇 번을 눌러야 key 문자가 나오는지 저장한다.
                presses.add(j + 1);
                // hashmap에는 해당 문자와 list를 집어넣는다.
                charMap.put(c, presses);
            }
        }

        // 4. 이제 targets의 문자 하나하나를 돌면서 눌러야 하는 최소 횟수를 찾는다.
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            boolean isPossible = true;

            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                if (charMap.containsKey(c)) {
                    // hashmap의 key중 해당 문자가 있다면 c의 리스트를 가져와 최소값을 찾는다. 헤당 문자가 없으면 -1.
                    int minPress = charMap.get(c).stream().min(Integer::compare).orElse(-1);
                    // 총 몇 번 눌러야 하는지 더한다.
                    totalPresses += minPress;
                } else {
                    isPossible = false;
                    break;
                }
            }

            answer[i] = isPossible ? totalPresses : -1;
        }

        return answer;
    }
}
