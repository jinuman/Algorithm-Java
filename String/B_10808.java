package String;
// 알파벳 개수
// ASCII code 연산을 하면 자동으로 int 형이 나옴
// String s = "abs"; s.charAt(i) - 'a';
// 만약 s.charAt(i)가 a 이면 0이 됨. 이걸 배열에 index 로 이용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] alphabet = new int[26];   // 0: a, 1: b, ..., 25: z
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            alphabet[idx] += 1;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}

/*
input
baekjoon

output
1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
*/
