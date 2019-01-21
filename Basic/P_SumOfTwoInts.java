package Basic;
// 두 정수 사이의 합
// 등차수열의 합 공식 이용

public class P_SumOfTwoInts {
    private long solution(int a, int b) {
        return summingUp(Math.min(a, b), Math.max(a, b));
    }

    private long summingUp(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {
        P_SumOfTwoInts ins = new P_SumOfTwoInts();
        System.out.println(ins.solution(3, 5));
        System.out.println(ins.solution(3, 2));
        System.out.println(ins.solution(5, 3));
    }
}
