import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class codekata71 {
    public static void main(String[] args) throws ParseException {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }
    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        // 1. Hashmap termsHashmap key는 terms의 앞 부분, value는 terms의 뒷 부분
        HashMap<String, Integer> termsHashmap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] parts = terms[i].split(" ");
            termsHashmap.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 2. privacies를 공백을 기준으로 앞 부분과 뒷 부분으로 나누어서 또다른 hashmap에 넣기
        // 이때, key가 뒷부분, value가 앞부분
        HashMap<String, Date> privaciesHashmap = new HashMap<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = terms[i].split(" ");
            String stringDate = parts[0];
            Date date = formatter.parse(stringDate);
            privaciesHashmap.put(parts[1], date);
        }

        // 3. today를 .을 기준으로 분리한다. year, month, day
        Date dateToday =

        // 4. for문으로 privaciesHashmap을 돌면서 termsHashmap key와 privaciesHashmap의 key가 같으면
        // 해당 value인 개인정보 수집 일자를 year, month, day로 나눈 다음
        // 유효기간만큼 month에 더하고, day -1한다.
        // 그 결과, day가 0이면 day +28, month -1
        // month가 13 이상이면 month -12, year +1
        // 그다음 today와 비교해서 수집 일자가 today를 넘기면 파기 대상이기 때문에, 해당 인덱스를 추적한다.


        return answer;
    }
}
