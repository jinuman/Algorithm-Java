package Graph;
// DFS와 BFS
// 인접 리스트 이용 - ArrayList<ArrayList<Integer>> a

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1260 {
    private static ArrayList<ArrayList<Integer>> a; // list 의 list 선언
    private static boolean[] isVisited;             // 방문 체크

    private static void dfs(int x) {
        isVisited[x] = true;
        System.out.print(x + " ");
        for (int i = 0; i < a.get(x).size(); i++) {
            int next = a.get(x).get(i); // 간선으로 이루어진 정점 중 제일 작은 다음 정점
            if (!isVisited[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        isVisited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x + " ");
            for (int next : a.get(x)) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    q.add(next);    // [1] 이면 next = 2, 3, 4
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 정점의 개수
        int m = Integer.parseInt(st.nextToken());   // 간선의 개수
        int startNode = Integer.parseInt(st.nextToken());   // 시작 정점번호
        a = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            a.add(new ArrayList<>());   // 정점의 개수 +1 만큼 생성
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a.get(u).add(v); a.get(v).add(u);   // 양방향 그래프
        }

        // 입력이 순서대로 이루어지지 않을 수 있기 때문에 sort 해준다
        for (int i = 1; i <= n; i++) {
            Collections.sort(a.get(i));
        }

        isVisited = new boolean[n + 1]; // 정점 check 배열 생성
        dfs(startNode);
        System.out.println();
        isVisited = new boolean[n + 1]; // 초기화
        bfs(startNode);
        System.out.println();
    }
}

/*
input
4 5 1
1 2
1 3
1 4
2 4
3 4

output
1 2 4 3
1 2 3 4
 */
