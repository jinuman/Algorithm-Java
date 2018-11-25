package DrawStars;
// 별찍기 - 9
// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2446 {
    private static void drawStar(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < i; j++) {
                    sb.append(" ");
                }
                for (int j = 2 * i; j < 2 * n - 1; j++) {
                    sb.append("*");
                }
            } else {
                int temp = i - n + 1;
                for (int j = temp; j < n - 1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2 * temp + 1; j++) {
                    sb.append("*");
                }
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
