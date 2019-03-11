package Math;
// 피보나치 함수

/*
int fibonacci(int n) {
    if (n == 0) System.out.print("0")
    else if (n == 1) System.out.print("1")
    else return fibonacci(n-1) + fibonacci(n-2);
}
*/
// 위 함수에서 fibonacci(N)을 호출했을 때, 0과 1이 몇번 호출되는지 구하는 문제
// dp[n][0] : fibonacci(n)에서 0이 몇번 호출되는지 저장
// dp[n][1] : fibonacci(n)에서 1이 몇번 호출되는지 저장

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1003 {
    private static int[][] dp = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc != 0) {
            tc -= 1;
            int n = Integer.parseInt(br.readLine());
            dp[0][0] = 1;
            dp[1][1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            }
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}

/*
input
3
0
1
3

output
1 0
0 1
1 2
 */