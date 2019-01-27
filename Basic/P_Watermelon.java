package Basic;
// 수박수박수박수박수박수?

public class P_Watermelon {
    private String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append((i % 2 == 1) ? "수" : "박");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        P_Watermelon ins = new P_Watermelon();
        System.out.println(ins.solution(3));
        System.out.println(ins.solution(4));
    }
}
