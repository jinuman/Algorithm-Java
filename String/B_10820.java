package String;
// 문자열 분석
// 소문자, 대문자, 숫자, 공백 순으로 출력

import java.util.Scanner;

public class B_10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int lower = 0, upper = 0, num = 0, space = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ('a' <= ch && ch <= 'z') {
                    lower += 1;
                } else if ('A' <= ch && ch <= 'Z') {
                    upper += 1;
                } else if ('0' <= ch && ch <= '9') {
                    num += 1;
                } else if (ch == ' ') {
                    space += 1;
                } else {
                    return;
                }
            }
            System.out.println(lower + " " + upper + " " + num + " " + space);
        }
    }
}

/*
input
This is String
SPACE    1    SPACE
 S a M p L e I n P u T
0L1A2S3T4L5I6N7E8

output
10 2 0 2
0 10 1 8
5 6 0 16
0 8 9 0
*/
