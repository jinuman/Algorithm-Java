package Graph;
// 연결 요소의 개수
// 양방향 그래프가 주어졌을 때, 연결 요소의 개수를 구하는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_11724 {
    private static ArrayList<ArrayList<Integer>> a;
    private static boolean[] isVisited;
    private static void dfs(int x) {
        isVisited[x] = true;
        for (int next : a.get(x)) {
            if (!isVisited[next]) {
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());   // 정점의 개수
        int m = Integer.parseInt(st.nextToken());   // 간선의 개수
        a = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a.get(u).add(v);
            a.get(v).add(u);
        }
        isVisited = new boolean[n + 1];
        int cnt = 0;    // 연결 요소의 개수
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i]) {
                dfs(i);
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}

/*
input
6 5
1 2
2 5
5 1
3 4
4 6

output
2
 */
