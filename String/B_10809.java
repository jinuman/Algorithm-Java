package String;
// 알파벳 찾기
// 문자열에서 각 알파벳이 처음 등장하는 위치를 구하는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] answer = new int[26];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';   // 해당 알파벳의 answer[] 에서의 자리
            if (answer[idx] == -1) {  // 한번도 안채워졌으면
                answer[idx] = i;      // 해당 알파벳의 인덱스를 집어넣는다.
            }
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}

/*
input
baekjoon

output
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
*/