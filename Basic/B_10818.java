package Basic;
// 최소, 최대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] line = br.readLine().split(" ");
        int maxNum = -1000000;
        int minNum = 1000000;
        for (String s : line) {
            int num = Integer.parseInt(s);
            maxNum = (num > maxNum) ? num : maxNum;
            minNum = (num < minNum) ? num : minNum;
        }
        System.out.println(minNum + " " + maxNum);
    }
}

/*
input
5
20 10 35 30 7

output
7 35
*/
