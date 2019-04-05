package Basic;
// 그대로 출력하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 100;
        while (cnt > 0) {
            cnt -= 1;
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}

/*
    Hello

Baekjoon
   Online Judge
*/