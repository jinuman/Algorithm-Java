package Basic;
// 팩토리얼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    private static int factorial(int n) {
        int facNum = 1;
        for (int i = 1; i <= n; i++) {
            facNum *= i;
        }
        return facNum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = factorial(n);
        System.out.println(result);
    }
}

/*
10
 */
