package Queue;
// 큐
// Queue - LinkedList
// push, pop, size, empty, front, back
// add, remove, size, isEmpty, peek, x  ( LinkedList )

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int back = 0;
        while (n != 0) {
            n -= 1;
            String[] line = br.readLine().split(" ");
            String cmd = line[0];
            switch (cmd) {
                case "push":
                    back = Integer.parseInt(line[1]);
                    q.add(back); break;
                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.remove()); break;
                case "size":
                    System.out.println(q.size()); break;
                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0); break;
                case "front":
                    System.out.println(q.isEmpty() ? -1 : q.peek()); break;
                case "back":
                    System.out.println(q.isEmpty() ? -1 : back); break;
            }
        }
    }
}

/*
input
15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front

output
1
2
2
0
1
2
-1
0
1
-1
0
3
 */
