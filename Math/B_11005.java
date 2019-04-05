package Math;
// 진법 변환 2
// 10진수 to B 진수
// 10진수 N을 B 진수로 바꾸려면 N을 B로 나눈 나머지를 계속 저장하고 reverse 하면 된다.
// StringBuilder 이용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11005 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);

        while (N != 0) {
            int r = N % B;
            if (r >= 10) {
                sb.append((char)(r - 10 + 'A'));
            } else {
                sb.append((char)(r + '0'));
            }
            N /= B;
        }

        System.out.println(sb.reverse());
    }
}

/*
input
60466175 36

output
ZZZZZ
 */
