package Basic;
// 네 수
// 10 20 30 40 --> 1020 + 3040 = 4060
// int to String : Integer.toString(int), String.valueOf(int)
// String to int : Integer.valueOf(String), Integer.parseInt(String)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        String a = line[0] + line[1];
        String b = line[2] + line[3];
        long answer = Long.parseLong(a) + Long.valueOf(b);
        System.out.println(answer);
    }
}

/*
input
10 20 30 40

output
4060
*/

