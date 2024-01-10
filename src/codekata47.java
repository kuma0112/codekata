import java.util.Arrays;
import java.util.Comparator;

public class codekata47 {
    public String[] solution(String[] strings, int n) {
        // 1. Arrays 클래스의 sort 메서드를 사용해서 strings 안에 들어 있는 단어들을 비교할 예정
        // 2. 이때 String을 인자로 받는 Comparator 인터페이스를 구현하여 비교 로직을 직접 작성한다.
        Arrays.sort(strings, new Comparator<String>() {
            // 3. 아래는 해당 비교 로직. Comparator인터페이스의 compare 메서드를 재정의한다. String 두 개를 인자로 받는다.
            @Override
            public int compare(String o1, String o2) {
                // 4.각 스트링의 n번째 문자를 가져온다.
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                // 5. n번째 문자가 같을 경우 사전순으로 정렬, 다를 경우 문자를 기준으로 비교하여 정렬한다.
                if (c1 == c2){
                    return o1.compareTo(o2);
                } else {
                    return Character.compare(c1, c2);
                }
            }
        });
        // 6. 정렬된 스트링 배열을 반환한다.
        return strings;
    }
}
