package codekata1_55;

public class codekata41 {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ", -1);
        String[] list2 = new String[list.length];

        for (int i = 0; i < list.length; i++) {
            list2[i] = "";
            for (int j = 0; j < list[i].length(); j++) {
                if (j % 2 == 0) {
                    list2[i] += Character.toUpperCase(list[i].charAt(j));
                } else {
                    list2[i] += Character.toLowerCase(list[i].charAt(j));
                }
            }
        }

        for (int i = 0; i < list2.length; i++) {
            if (i != list2.length - 1) {
                answer += list2[i] + " ";
            } else {
                answer += list2[i];
            }
        }
        return answer;
    }
}

