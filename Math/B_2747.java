package Math;
// 피보나치 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2747 {
    private static int[] dp = new int[46];
    private static int fibonacciNumber(int n) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= 45; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacciNumber(n));
    }
}

/*
input
10

output
55
 */