package Greedy;
// 회의실 배정
// 끝나는 시간이 가장 빠른 회의부터 먼저 선택하는 방식 사용
// 끝나는 시간이 같다면 시작시간 기준으로 오름차순 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_1931 {
    public static class Meeting implements Comparable<Meeting> {
        int begin;
        int end;

        Meeting(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            // 끝나는 시간 기준으로 오름차순
            if (o.end < this.end) {
                return 1;
            } else if (o.end > this.end) {
                return -1;
            } else {    // 같으면
                return this.begin - o.begin;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Meeting(begin, end));
        }
        Collections.sort(list);
        int now = 0;
        int answer = 0;
        for (Meeting meeting : list) {
            if (now <= meeting.begin) {
                now = meeting.end;
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}

/*
input
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14

output
4
 */
