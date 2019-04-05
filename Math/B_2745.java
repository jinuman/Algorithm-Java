package Math;
// B진수 to 10진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String N = inputs[0];
        int B = Integer.parseInt(inputs[1]);
        int answer = 0;
        int index = N.length() - 1;  // 앞에서부터 계산
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if ('0' <= c && c <= '9') {
                answer += (c - '0') * Math.pow(B, index);
                index -= 1;
            } else if ('A' <= c && c <= 'Z') {
                answer += (c - 'A' + 10) * Math.pow(B, index);
                index -= 1;
            }
        }
        System.out.println(answer);
    }
}

/*
input
ZZZZZ 36

output
60466175
*/