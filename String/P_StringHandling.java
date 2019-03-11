package String;
// 문자열 다루기 기본
// 숫자인지 아닌지 판별하는 법 = 예외처리, 정규표현식(s.matches("^[0-9]*$")),
// s.charAt(i) -> '0' < c < '9' 인지 판별

public class P_StringHandling {
    public boolean solution(String s) {
        boolean answer;
        int len = s.length();
        answer = (len == 4 || len == 6) && isNum(s);
        return answer;
    }
    private static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        P_StringHandling ins = new P_StringHandling();
        System.out.println(ins.solution("a234"));   // false
        System.out.println(ins.solution("1234"));   // true
    }
}