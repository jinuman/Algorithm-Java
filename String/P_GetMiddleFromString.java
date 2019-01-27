package String;
// 가운데 글자 가져오기

public class P_GetMiddleFromString {
    private String solution(String s) {
        int len = s.length();
        if (len % 2 == 0) {
            return s.substring(len / 2 - 1, len / 2 + 1);
        } else {
            return s.substring(len / 2, len / 2 + 1);
        }
    }
    public static void main(String[] args) {
        P_GetMiddleFromString ins = new P_GetMiddleFromString();
        String s1 = "abcde";
        String s2 = "qwer";
        System.out.println(ins.solution(s1));
        System.out.println(ins.solution(s2));
    }
}
