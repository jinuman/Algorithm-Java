package Math;
// GCD 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_9613 {
    private static int gcd(int a, int b) {
        // gcd(a, b) = gcd(b, r) : 유클리드 호제법
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc != 0) {
            tc -= 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            long answer = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    answer += gcd(a[i], a[j]);
                }
            }
            System.out.println(answer);
        }
    }
}

/*
input
3
4 10 20 30 40
3 7 5 12
3 125 15 25

output
70
3
35
*/
