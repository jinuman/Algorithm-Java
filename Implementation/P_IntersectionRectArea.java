package Implementation;
// 영역 교차 검사하기
// 글램 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_IntersectionRectArea {
    private static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class Rect {
        // y
        int top;
        int bottom;

        // x
        int left;
        int right;

        Rect(int px, int py, int qx, int qy) {
            this.top = Math.max(py, qy);
            this.bottom = Math.min(py, qy);
            this.left = Math.min(px, qx);
            this.right = Math.max(px, qx);
        }
    }

    private static int getIntersectionArea(Point p, Point q, Point r, Point s) {
        Rect a = new Rect(p.x, p.y, q.x, q.y);
        Rect b = new Rect(r.x, r.y, s.x, s.y);

        int top = Math.min(a.top, b.top);
        int bottom = Math.max(a.bottom, b.bottom);
        int left = Math.max(a.left, b.left);
        int right = Math.min(a.right, b.right);

        if (bottom > top || left > right) {
            return 0;
        }
        int width = right - left;
        int height = top - bottom;

        return width * height;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Point p = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Point q = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Point r = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Point s = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        int answer = getIntersectionArea(p, q, r, s);
        System.out.println(answer);
    }
}

/*
Input
-7 5
0 0
-3 -3
4 2

Output
6
*/

/*
Input
1 1
0 0
2 2
1 1

Output
0
*/
