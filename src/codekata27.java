public class codekata27 {
    public String solution(String phone_number) {
        String answer = "";
        String subString = "";
        String star = "*";
        subString = phone_number.substring(phone_number.length()-4, phone_number.length());
        for (int i = 0; i<phone_number.length()-4; i++){
            answer += star;
        }
        answer = answer + subString;
        return answer;
    }
}
