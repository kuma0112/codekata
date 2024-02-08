import java.util.HashSet;

public class codekata55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        HashSet<String> usedWords = new HashSet<>();
        int index = 0;

        for (String word : goal) {
            // 1. 이미 사용한 단어인지 확인한다.
            if (usedWords.contains(word)) {
                return "No"; // 이미 사용한 단어일 경우 "No" 반환한다.
            }

            // 2. 현재 단어가 cards1에 있다면 해당 카드 뭉치를 사용한다. cards2에 있다면 cards 뭉치를 사용한다.
            if (index < cards1.length && word.equals(cards1[index])) {
                index++;
            }
            else if (index < cards2.length && word.equals(cards2[index])) {
                index++;
            }
            else {
                return "No";
            }

            usedWords.add(word);
        }
        // 3. 모든 단어를 순서대로 사용했을 경우 "Yes" 반환한다.
        return "Yes";
    }
}
