package Basic;
// 접미사 배열
// substring (begin[, end])

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().trim();
        String[] words = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            words[i] = word.substring(i);
        }
        Arrays.sort(words);
        for (String w : words) {
            System.out.println(w);
        }
    }
}

/*
input
baekjoon

output
aekjoon
baekjoon
ekjoon
joon
kjoon
n
on
oon
 */
