package Basic;
// 단어의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            st.nextToken(); // nextToken 이 호출되면 st 에서 pop 된다.
            cnt += 1;
        }
        System.out.println(cnt);
    }
}

/*
input
 Mazatneunde Wae Teullyeoyo

output
3
*/