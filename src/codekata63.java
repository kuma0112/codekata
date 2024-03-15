import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class codekata63 {
    public String solution(String X, String Y) {
        String answer = "";

        ArrayList<Character> arrayX = new ArrayList<>();
        ArrayList<Character> arrayY= new ArrayList<>();

        for (int i = 0; i < X.length(); i++){
            arrayX.add(X.charAt(i));
        }

        for (int i = 0; i < Y.length(); i++){
            arrayY.add(Y.charAt(i));
        }

        ArrayList<Character> commonChars = new ArrayList<>();
        for (Character ch : arrayX) {
            if (arrayY.contains(ch)) {
                commonChars.add(ch);
                arrayY.remove(ch);
            }
        }

        if (commonChars.isEmpty()) {
            return "-1";
        }

        Collections.sort(commonChars);
        StringBuilder sb = new StringBuilder();
        for (Character ch : commonChars) {
            sb.append(ch);
        }

        String result = sb.toString();
        if (result.replaceAll("0", "").isEmpty()) {
            return "0";
        }

        return result;
    }
}
