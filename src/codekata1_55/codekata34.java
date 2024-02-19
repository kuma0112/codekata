package codekata1_55;

import java.util.*;

public class codekata34 {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        return sortedString;
    }
}
