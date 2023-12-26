public class codekata41 {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        for (int index = 0; index < words.length; index++){
            char[] array = words[index].toCharArray();
            for(int i = 0; i < array.length; i++){
                if ((i % 2 == 0 && Character.isLowerCase(array[i])) || (i == 0 && Character.isLowerCase(array[i]))) {
                    array[i] = Character.toUpperCase(array[i]);
                } else if ((i % 2 != 0 && Character.isUpperCase(array[i])) || (i != 0 && Character.isUpperCase(array[i]))) {
                    array[i] = Character.toLowerCase(array[i]);
                }
            }
            words[index] = new String(array);
        }
        for(int i = 0; i<words.length; i++){
            if (i < words.length-1){
                answer += words[i] + " ";
            }
        }

        answer += words[words.length-1];
        return answer;
    }
}

class asdf{
    public static void main(String[] args) {
        String s = "try hello  world ";
        String answer = "";
        StringBuilder string = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                string.append(c);
            }
            String[] words = s.split(" ");
            for (String word : words) {
                char[] array = word.toCharArray();

                for (int i = 0; i < array.length; i++) {
                    if ((i % 2 == 0 && Character.isLowerCase(array[i])) || (i == 0 && Character.isLowerCase(array[i]))) {
                        array[i] = Character.toUpperCase(array[i]);
                    } else if ((i % 2 != 0 && Character.isUpperCase(array[i])) || (i != 0 && Character.isUpperCase(array[i]))) {
                        array[i] = Character.toLowerCase(array[i]);
                    }
                }
                string.append(array);
            }
        }
    }
}
