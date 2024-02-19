package codekata1_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codekata51 {
    public static String solution(int[] food) {

        StringBuilder str = new StringBuilder();
        for (int j = 0; j < food.length; j++) {
            int a = food[j];
            for (int i = 0; i < a / 2; i++) {
                str.append(j);
            }
        }
        String sb = str + "0";
        sb = sb + str.reverse();
        // 3. 해당 배열에 0을 더한다.
        System.out.println("sb = " + sb);
        return sb;
    }

    public static void main(String[] args) {
        int[] food = {1,7,1,2};
        String answer = "";
        answer = solution(food);

        System.out.println("answer = " + answer);
    }
}
