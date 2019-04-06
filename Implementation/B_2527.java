package Implementation;
// 직사각형

// a: 직사각형, b: 선분, c: 점, d: 공통부분 없음
// (x, y): 왼쪽 아래, (p, q): 오른쪽 위 꼭지점 좌표

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2527 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] rectA = new int[4];
            int[] rectB = new int[4];

            for (int j = 0; j < 4; j++) {
                rectA[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < 4; j++) {
                rectB[j] = Integer.parseInt(st.nextToken());
            }

            // 겹치는 부분의 rect
            int left = Math.max(rectA[0], rectB[0]);
            int right = Math.min(rectA[2], rectB[2]);
            int top = Math.min(rectA[3], rectB[3]);
            int bottom = Math.max(rectA[1], rectB[1]);

            int width = right - left;
            int height = top - bottom;

            if (width == 0 && height == 0) {
                System.out.println("c");
            } else if (width == 0 || height == 0) {
                System.out.println("b");
            } else if (width < 0 || height < 0) {
                System.out.println("d");
            } else {
                System.out.println("a");
            }
        }
    }
}

/*
input
3 10 50 60 100 100 200 300
45 50 600 600 400 450 500 543
11 120 120 230 50 40 60 440
35 56 67 90 67 80 500 600

output
d
a
a
b
 */
