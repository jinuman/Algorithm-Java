package Basic;
// 숫자의 합
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 합하는 문제
// int = char item - '0'

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String line = br.readLine();
        int sum = 0;
        char[] numbers = line.toCharArray();
        for (char item : numbers) {
            sum += item - '0';
        }
        System.out.println(sum);
    }
}

/*
input
5
54321

output
15
*/