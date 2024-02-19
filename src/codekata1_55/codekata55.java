package codekata1_55;

public class codekata55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 각 카드 뭉치에서 현재 선택된 카드를 추적하는 인덱스
        int index1 = 0, index2 = 0;
        for (String word : goal) {
            boolean found = false; // 단어가 카드 뭉치에서 찾아졌으면 true. 기본값은 false

            // 1. 첫 번째 카드 뭉치에서 현재 단어를 찾음
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
                found = true;
            }
            // 2. 두 번째 카드 뭉치에서 현재 단어를 찾음
            else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
                found = true;
            }

            // 3. 현재 단어를 두 카드 뭉치에서 찾지 못했다면(한 개라도 false가 있다면), goal을 이룰 수 없으므로 No 반환
            if (!found) {
                return "No";
            }
        }

        // 4. 모든 단어를 찾았다면, goal 문장을 만들었으므로 Yes 반환
        return "Yes";

        /*
        Queue를 이용하여 찾는 방법
        -> 각각의 queue를 만든 뒤, 서로 일치하면 하나씩 뽑음.
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for(String str : goal) {
            qGoal.offer(str);
        }

        for(String card : cards1) {
            qCard1.offer(card);
        }

        for(String card : cards2) {
            qCard2.offer(card);
        }

        while(!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if(str.equals(qCard1.peek())) qCard1.poll();
            else if(str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";

         */
    }
}
