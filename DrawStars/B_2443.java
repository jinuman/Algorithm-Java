package DrawStars;
// 별찍기 - 6
// *********
//  *******
//   *****
//    ***
//     *

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2443 {
    private static void drawStar(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int j = 2 * i; j < 2 * n - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        drawStar(n);
    }
}

/*
5
 */
