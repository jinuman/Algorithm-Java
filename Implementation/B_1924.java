package Implementation;
// 2007년
// 2007년 1월 1일은 월요일, 2007년 x월 y일의 요일을 구하는 문제
// 총 날짜를 세고, 7로 나누면 요일을 구할 수 있음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1924 {
    private static final String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private static final int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());   // 월 입력
        int d = Integer.parseInt(st.nextToken());   // 일 입력
        int sumDays = 0;
        for (int i = 0; i < m - 1; i++) {
            sumDays += month[i];
        }
        sumDays += d;
        System.out.println(week[sumDays % 7]);
    }
}

/*
input
12 25

output
TUE
 */