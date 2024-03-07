public class codekata62 {
    public int solution(String[] babbling) {
        // 1. 가능한 발음 조합 정의
        String[] validSounds = {"aya", "ye", "woo", "ma"};

        int answer = 0;
        for (String word : babbling) {
            String tempWord = word;
            for (String sound : validSounds) {
                // 2. 주어진 단어에서 유효한 발음 제거
                tempWord = tempWord.replaceAll(sound, "");
            }
            // 3. 모든 유효한 발음을 제거한 후 남은 문자가 없으면 가능한 단어
            if (tempWord.isEmpty()) {
                boolean isValid = true;
                String checkWord = word;
                // 4. 연속된 같은 발음 체크 방지
                for (String sound : validSounds) {
                    // 해당 발음으로 시작하는 경우, 발음 길이만큼 잘라내며 중복 체크
                    while (checkWord.startsWith(sound)) {
                        checkWord = checkWord.substring(sound.length());
                        if (checkWord.startsWith(sound)) {
                            // 연속해서 같은 발음 발견 시 무효 처리
                            isValid = false;
                            break;
                        }
                    }
                    if (!isValid) break;
                }
                if (isValid) answer++;
            }
        }
        return answer;
    }
}
