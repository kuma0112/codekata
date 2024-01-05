//public class codekata45 {
//    public String solution(String s, int n) {
//        String answer = "";
//
//        char[] array = s.toCharArray();
//        int a = 0;
//        for (char c : array) {
//            a = (int) c;
//            if (Character.isUpperCase(c)) {
//                a = a + n;
//                if (90 < a + n && a + n < 116) {
//                    a = a + n - 26;
//                }
//                c = (char) a;
//            } else if (Character.isLowerCase(c)) {
//                a = a + n;
//                if (a + n ) {
//                    a = a + n - 27;
//                }
//                c = (char) a;
//            } else {
//                c = ' ';
//            }
//            answer += c;
//        }
//
//        return answer;
//    }
//}
