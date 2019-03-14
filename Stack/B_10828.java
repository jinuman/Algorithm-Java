package Stack;
// 스택
// push, pop, size, isEmpty, peek

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        while (n != 0) {
            n -= 1;
            String[] line = br.readLine().split(" ");
            switch (line[0]) {
                case "push":
                    st.push(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    System.out.println(st.isEmpty() ? -1 : st.pop());
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
                case "empty":
                    System.out.println(st.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(st.isEmpty() ? -1 : st.peek());
                    break;
            }
        }
    }
}

/*
input
7
pop
top
push 123
top
pop
top
pop

output
-1
-1
123
123
-1
-1
 */
