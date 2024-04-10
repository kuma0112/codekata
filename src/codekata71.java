import java.text.ParseException;
import java.util.*;

public class codekata71 {
    public static void main(String[] args) throws ParseException {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(solution(today, terms, privacies));
    }
    public static List<Integer> solution(String today, String[] terms, String[] privacies) throws ParseException {
        List<Integer> answer = new ArrayList<>();
        // 1. Hashmap termsHashmap key는 terms의 앞 부분, value는 terms의 뒷 부분
        HashMap<String, Integer> termsHashmap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termsHashmap.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 2. privacies를 공백을 기준으로 앞 부분과 뒷 부분으로 나누어서 또다른 hashmap에 넣기
        // 이때, key가 뒷부분, value가 앞부분
        HashMap<String, String> privaciesHashmap = new HashMap<>();
        for (String privacy : privacies) {
            String[] parts = privacy.split(" ", 2);
            privaciesHashmap.put(parts[1], parts[0]);
        }

        // 3. today를 .을 기준으로 분리한다. year, month, day
        String[] todayString = today.split("\\.");
        int year = Integer.parseInt(todayString[0]);
        int month = Integer.parseInt(todayString[1]);
        int day = Integer.parseInt(todayString[2]);

        // 4. for문으로 privaciesHashmap을 돌면서 termsHashmap key와 privaciesHashmap의 key가 같으면
        // 해당 value인 개인정보 수집 일자를 year, month, day로 나눈 다음
        // 유효기간만큼 month에 더하고, day -1한다.
        // 그 결과, day가 0이면 day +28, month -1
        // month가 13 이상이면 month -12, year +1

        int check = 0;
        for (String key : privaciesHashmap.keySet()){
            if(termsHashmap.containsKey(key)) {
                String[] privaciesString = privaciesHashmap.get(key).split("\\.");
                int privaciesYear = Integer.parseInt(privaciesString[0]);
                int privaciesMonth = Integer.parseInt(privaciesString[1]);
                int privaciesDay = Integer.parseInt(privaciesString[2]);
                privaciesMonth += termsHashmap.get(key);

                if (privaciesMonth >= 13) {
                    privaciesMonth -= 12;
                    privaciesYear += 1;
                }

                if (privaciesYear < year || (privaciesYear == year && privaciesMonth < month)
                        || (privaciesYear == year && privaciesMonth == month && privaciesDay < day)){
                    for (int i = 0; i < privacies.length; i++) {
                        if (privacies[i].endsWith(key)) {
                            check = i;
                        }
                    }
                }
                answer.add(check);
            }
        }
        return answer;
    }
}
