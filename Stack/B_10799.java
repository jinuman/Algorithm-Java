package Stack;
// 쇠막대기
// 스택을 이용하는 문제
// () : 레이저, 쇠막대기의 왼쪽 끝: (, 쇠막대기의 오른쪽 끝: )

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10799 {
    private static int solution(String ironRod) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < ironRod.length(); i++) {
            char ch = ironRod.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (i == 0) {
                    return 0;
                }
                st.pop();
                if (ironRod.charAt(i - 1) == '(') { // 레이저
                    answer += st.size();
                } else {    // 닫는 괄호
                    answer += 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}

/*
input
()(((()())(())()))(())

output
17
 */
