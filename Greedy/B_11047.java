package Greedy;
// 동전 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().trim().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int answer = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] <= k) {
                int cnt = k / a[i];
                answer += cnt;
                k -= (cnt * a[i]);
            }
        }
        System.out.println(answer);
    }
}

/*
input
10 4200
1
5
10
50
100
500
1000
5000
10000
50000

output
6
 */
