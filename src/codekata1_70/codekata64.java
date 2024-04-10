package codekata1_70;

import java.util.HashMap;

public class codekata64 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 1. 2부터 n까지가 key인 hashmap을 생성한다. default value는 1이다.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        // 2. key가 reserve 배열에 들은 값과 같으면 value에 1을 더한다. lost 배열에 들은 값과 같으면 value에 1을 뺀다.
        for (int r : reserve) {
            map.put(r, map.get(r) + 1);
        }
        for (int l : lost) {
            map.put(l, map.get(l) - 1);
        }

        // 3. for문을 작성한다. 위에서 작성한 hashmap의 임의의 key i가 n일 때, i-1의 value가 0이면 i의 value에 1을 빼고 i-1의 value의 1을 더한다.
        // else 구문에서는 i+1의 value가 0이면 i의 value에 1을 빼고 i+1의 value의 1을 더한다.
        for (int i = 1; i <= n; i++) {
            if (map.get(i) > 1) {
                if (i > 1 && map.get(i - 1) == 0) {
                    map.put(i, map.get(i) - 1);
                    map.put(i - 1, map.get(i - 1) + 1);
                } else if (i < n && map.get(i + 1) == 0) {
                    map.put(i, map.get(i) - 1);
                    map.put(i + 1, map.get(i + 1) + 1);
                }
            }
        }

        // 4. value가 1인 key의 개수를 return 한다.
        for (int i = 1; i <= n; i++) {
            if (map.get(i) >= 1) {
                answer++;
            }
        }

        return answer;
    }
}
