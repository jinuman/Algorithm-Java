package String;
// 서울에서 김서방 찾기

public class P_FindKim {
    private String solution(String[] seoul) {
        int idx = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                idx = i;
            }
        }
        return "김서방은 " + idx + "에 있다";
    }
    public static void main(String[] args) {
        P_FindKim ins = new P_FindKim();
        String[] s = {"Jane", "Kim"};
        System.out.println(ins.solution(s));
    }
}
