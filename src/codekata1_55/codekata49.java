package codekata1_55;

import java.util.*;

public class codekata49
{
    public List<Integer> solution(int[] numbers) {
        /**
         * 정수 배열 numbers가 주어집니다.
         * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
         * 더해서 만들 수 있는 모든 수를
         * 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
         */
        List<Integer> answer = new ArrayList<>();
        //1. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑고 이를 더하는 모든 상황을 for문으로 만든다.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j< numbers.length; j++){
                int a = numbers[i] + numbers[j];
                answer.add(a);
            }
        }

        //2. 겹치는 수를 제거하기 위해 hashset에 담는다.
        Set<Integer> uniqueNumbers = new HashSet<>(answer);
        //3. 깨끗하게 비운 answer에 hashset으로 중복이 제거된 값을 다시 넣는다.
        answer.clear();
        answer.addAll(uniqueNumbers);

        //4. 오름차순으로 담은 뒤 값을 리턴한다.
        Collections.sort(answer);
        return answer;
    }
}
