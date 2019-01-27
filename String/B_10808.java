package String;
// 알파벳 개수
// 문자열에서 각 알파벳이 몇 개가 포함되어 있는지 구하는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] alphabet = new int[26];
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
