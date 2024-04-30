import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class codekata72 {
    public String[] solution(String[] players, String[] callings) {
        // 1. Arraylist ranking에 선수들의 현재 순위를 담는다.
        List<String> ranking = new ArrayList<>(Arrays.asList(players));

        // 2. callings를 돌면서, 선수의 이름을 부르면 해당 선수를 찾아서 1등이 아니면 앞칸으로 이동시킨다.
        // 이때 swap() 메서드를 사용하여 리스트 내 두 요소의 위치를 교환한다.
        for (String calledName : callings) {
            int index = ranking.indexOf(calledName);
            if (index > 0) {
                Collections.swap(ranking, index, index - 1);
            }
        }

        // 3. 최종 순위를 배열로 변환하여 반환한다.
        return ranking.toArray(new String[0]);
    }
}
