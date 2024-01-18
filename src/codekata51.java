public class codekata51 {
    public String solution(int[] food) {

        /*
        이번 대회를 위해 수웅이는 음식을 주문했는데, 대회의 조건을 고려하지 않고 음식을 주문하여
        몇 개의 음식은 대회에 사용하지 못하게 되었습니다.

        예를 들어, 3가지의 음식이 준비되어 있으며, 칼로리가 적은 순서대로 1번 음식을 3개, 2번 음식을 4개, 3번 음식을 6개 준비했으며,
        물을 편의상 0번 음식이라고 칭한다면,
        두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로 음식의 배치는 "1223330333221"이 됩니다.
        따라서 1번 음식 1개는 대회에 사용하지 못합니다.

        수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때,
        대회를 위한 음식의 배치를 나타내는 문자열을 return 하는 solution 함수를 완성해주세요.

        3 / 2 = 1 ... 1 (나머지는 사용하지 못하는 음식의 개수 0 아니면 1)
        4 / 2 = 2
        6 / 2 = 3
        수의 숫자만큼 적기 -> 가운데는 0 -> 거꾸로
        */

        String answer = "";

        // 1. 준비한 음식의 개수를 담은 배열을 돌며 2로 나눈 몫을 구한다.
        // 2. 몫만큼 숫자를 적는 String 배열을 만든다.
        // 3. 해당 배열에 0을 더한다.
        // 4. (0넣기 전에 할 것)String 배열을 거꾸로 넣은 다른 String 배열을 만든 후, 3과 4를 합친다.
        return answer;
    }
}
