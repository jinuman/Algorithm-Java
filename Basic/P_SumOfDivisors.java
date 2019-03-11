package Basic;
// 약수의 합
// for 문을 n/2만 돌리는 방법

public class P_SumOfDivisors {
    private int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer + n;
    }

    public static void main(String[] args) {
        P_SumOfDivisors ins = new P_SumOfDivisors();
        System.out.println(ins.solution(12));   // 28
        System.out.println(ins.solution(5));    // 6
    }
}
