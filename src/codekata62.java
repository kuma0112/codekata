public class codekata62 {
    public int solution(String[] babbling) {
        String[] validSounds = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            String tempWord = word;
            for (String sound : validSounds) {
                tempWord = tempWord.replaceAll(sound + sound, " "); // 연속된 발음 제거
            }

            String checkWord = tempWord;
            for (String sound : validSounds) {
                checkWord = checkWord.replaceAll(sound, ""); // 발음 제거
            }

            if (checkWord.length() == 0 && !tempWord.contains(" ")) { // 남은 문자열 검사 및 연속된 발음 체크
                count++;
            }
        }

        return count;
    }
}
