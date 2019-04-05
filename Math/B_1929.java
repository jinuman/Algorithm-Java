package Math;
// 소수 구하기

// 에라토스테네스의 체
// 1. 범위의 check 배열을 만든다.
// 2. 0번, 1번방을 true 로 하고, false 인 수 중 가장 작은 수를 찾는다.
// 3. 그 수는 이제 소수이다.
// 4. 이제 그 수의 배수는 모두 소수가 아니다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1929 {
    private static final int MAX = 1000000;
    private static boolean[] isNotPrime;
    // Sieve of Eratosthenes
    private static void eratosthenes () {
        // true : 지워짐. 즉, 소수 아님
        isNotPrime = new boolean[MAX + 1];
        for (int i = 0; i * i <= MAX; i++) {
            if (i == 0 || i == 1) {
                isNotPrime[0] = isNotPrime[1] = true;
            }
            if (!isNotPrime[i]) {
                for (int j = i + i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        eratosthenes();
        for (int i = m; i <= n; i++) {
            if (!isNotPrime[i]) {
                System.out.println(i);
            }
        }
    }
}

/*
input
3 16

output
3
5
7
11
13
 */
