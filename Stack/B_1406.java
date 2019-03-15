package Stack;
// 에디터
// 커서를 기준으로 left 스택, right 스택으로 나눈다.
// L(커서를 왼쪽으로 한칸), D(커서를 오른쪽으로 한칸), B(커서 왼쪽에 있는 문자를 삭제)
// P $ ($라는 문자를 커서 왼쪽에 추가)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        // 먼저 left 스택에 다 집어 넣는다.
        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            char cmd = line[0].charAt(0);   // String to char
            if (cmd == 'L') {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if (cmd == 'D') {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if (cmd == 'B') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (cmd == 'P') {
                char tmp = line[1].charAt(0);
                left.push(tmp);
            }
        }
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        StringBuilder result = new StringBuilder();
        while (!right.isEmpty()) {
            result.append(right.pop());
        }
        System.out.println(result);
    }
}

/*
input
abcd
3
P x
L
P y

output
abcdyx
 */
