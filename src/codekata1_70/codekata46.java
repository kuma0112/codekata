package codekata1_70;

public class codekata46 {
    public int solution(String s) {
        int answer = 0;
        // 1. one~nine 을 인자로 갖는 array를 설정한다.
        String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // 2. 0~9까지 돌아가며 String s 에 array 인자값이 있을 경우 해당 숫자로 바꿔준다.
        for (int i = 0; i < array.length; i++){
            s.replaceAll(array[i], Integer.toString(i));
        }

        // 3. String s 를 integer로 형변환한다.
        return Integer.parseInt(s);

        /* 원래 코드 ->
        - 하나하나 one~nine이 있는지 확인하였다.
          생각해 보니 매번 .contains메서드를 호출하여 String s 를 확인해야 할 뿐더러 필요없는 부분이라 삭제
        - 직관적이지만, 길고 유지보수가 어려운 코드였다. 수정한 코드처럼 for문을 돌릴 때 라인 수가 훨씬 줄어든다.

        if (s.contains("zero")){
            s = s.replace("zero", "0");
        }
        if (s.contains("one")){
            s = s.replace("one", "1");
        }
        if (s.contains("two")){
            s = s.replace("two", "2");
        }
        if (s.contains("three")){
            s = s.replace("three", "3");
        }
        if (s.contains("four")){
            s = s.replace("four", "4");
        }
        if (s.contains("five")){
            s = s.replace("five", "5");
        }
        if (s.contains("six")){
            s = s.replace("six", "6");
        }
        if (s.contains("seven")){
            s = s.replace("seven", "7");
        }
        if (s.contains("eight")){
            s = s.replace("eight", "8");
        }
        if (s.contains("nine")){
            s = s.replace("nine", "9");
        }

        answer = Integer.parseInt(s);
        return answer;
         */
    }
}
