package codekata1_70;

class codekata43 {
    public int solution(String t, String p) {
        int answer = 0;
        String[] strArray = new String[t.length()-p.length()+1];
        for(int i = 0; i<t.length(); i++){
            for(int j = 0; j<p.length(); j++){
                char[] array = t.toCharArray();
                strArray[i] += array[i];
                i++;
            }
            int number = Integer.parseInt(strArray[i]);
            int number2 = Integer.parseInt(p);
            if(number<number2){
                answer++;
            }
        }
        return answer;
    }
}