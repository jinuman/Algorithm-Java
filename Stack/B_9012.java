package Stack;
// 괄호 ( Parenthesis )
// Stack 이용
// push: cnt += 1, pop: cnt -= 1 이런 방법도 가능

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_9012 {
    private static String check(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (str.charAt(i) == ')') {
                // ')'가 '('앞에 오면 닫을 방법이 없음
                if (st.isEmpty()) {
                    return "NO";
                }
                st.pop();
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            System.out.println(check(br.readLine()));
        }
    }
}

/*
input
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(

output
NO
NO
YES
NO
YES
NO
 */
