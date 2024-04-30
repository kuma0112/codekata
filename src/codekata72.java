import java.util.*;

public class codekata72 {
    public String[] solution(String[] players, String[] callings) {
        // 1. Hashmap에 선수(key)와 현재 순위(value)를 넣는다
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }

        // 2. callings를 돌면서, 해당 이름이 나오면 앞선수를 찾아서 위치를 바꿔준다
        for (String calledName : callings) {
            int index = indexMap.get(calledName);
            if (index > 0) {
                // 바로 앞에 있는 선수 찾은 다음
                String frontPlayer = players[index - 1];

                // 선수들 위치 교환
                players[index - 1] = calledName;
                players[index] = frontPlayer;

                indexMap.put(calledName, index - 1);
                indexMap.put(frontPlayer, index);
            }
        }
        return players;
    }
}
