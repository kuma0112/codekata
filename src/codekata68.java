import java.util.ArrayList;

public class codekata68 {
    public int solution(int[] ingredient) {
        int answer = 0;
        // 1. int 배열을 arraylist에 넣기
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i< ingredient.length; i ++) {
            array.add(ingredient[i]);
        }

        for (int i = 0; i < array.size()-3; i++) {
            if (array.get(i)== 1 && array.get(i+1) == 2 && array.get(i+2) == 3 && array.get(i+3) == 1) {
                answer ++;
                array.remove(i+3);
                array.remove(i+2);
                array.remove(i+1);
                array.remove(i);
                i = 0;
            }
        }
        return answer;
    }
}
