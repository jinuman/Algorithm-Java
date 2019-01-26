package DrawStars;
// 별찍기 - 1
// *
// **
// ***
// ****
// *****

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2438 {
    private static void drawStar(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
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
