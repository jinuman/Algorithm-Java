package Basic;
// x만큼 간격이 있는 n개의 숫자

import java.util.Arrays;

public class P_SpacedByX {
    private static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(0, 3)));    // [0, 0, 0]
        System.out.println(Arrays.toString(solution(2, 5)));    // [2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(solution(4, 3)));    // [4, 8, 12]
        System.out.println(Arrays.toString(solution(-4, 2)));   // [-4, -8]
    }
}
