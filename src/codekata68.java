import java.util.ArrayList;
import java.util.Stack;

public class codekata68 {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(solution(ingredient));
    }

    public static int solution(int[] ingredient) {
        int count = 0;
        int[] array = new int[ingredient.length];
        int index = 0;
        for (int i : ingredient) {
            array[index] = i;
            if (index >= 3 && array[index-3] == 1
                    && array[index-2] == 2
                    && array[index-1] == 3
                    && array[index] == 1) {
                count ++;
                index -= 4;
            }
            index++;
        }
        return count;
    }
}
