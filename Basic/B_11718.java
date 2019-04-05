package Basic;
// 그대로 출력하기

import java.util.ArrayList;
import java.util.Scanner;

public class B_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            lines.add(line);
        }
        sc.close();

        for (String line : lines) {
            System.out.println(line);
        }
    }
}

/*
Hello
Baekjoon
Online Judge
*/
