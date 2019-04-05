package Basic;
// 예산
// 2018 섬머

import java.util.Arrays;

public class P_Budget {
    private static int solution(int[] d, int budget) {
        int answer= 0;
        Arrays.sort(d);
        int need = 0;
        for (int item : d) {
            if (item + need > budget) {
                break;
            }
            need += item;
            answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 3, 2, 5, 4};
        int[] d2 = {2, 2, 3, 3};
        System.out.println(solution(d1, 9));    // 3
        System.out.println(solution(d2, 10));   // 4
    }
}
