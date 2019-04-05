package Kakao;
// 나머지 한 점
// 직사각형의 세 점이 주어지고 나머지 한 점을 구하는 문제

import java.util.ArrayList;
import java.util.Arrays;

public class P_LastPoint {
    private static int[] solution(int[][] v) {
        int[] answer = new int[2];
        ArrayList<Integer> listX = new ArrayList<>();
        ArrayList<Integer> listY = new ArrayList<>();
        for (int[] point : v) {
            listX.add(point[0]);
            listY.add(point[1]);
        }
        int resultX = 0;
        int resultY = 0;
        int tmp = 0;
        for (int x : listX) {
            resultX = tmp ^ x;
            tmp = resultX;
        }
        tmp = 0;
        for (int y : listY) {
            resultY = tmp ^ y;
            tmp = resultY;
        }
        answer[0] = resultX;
        answer[1] = resultY;

        return answer;
    }
    public static void main(String[] args) {
        int[][] test1 = {{1, 4}, {3, 4}, {3, 10}};
        int[][] test2 = {{1, 1}, {2, 2}, {1, 2}};
        System.out.println(Arrays.toString(solution(test1)));   // [1, 10]
        System.out.println(Arrays.toString(solution(test2)));   // [2, 1]
    }
}
