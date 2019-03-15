package Temporary;
// 동전 0
// Greedy Algorithm

import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = n-1; i >= 0; i--) {
            int quotient = k / a[i];
            cnt += quotient;
            k -= (quotient * a[i]);
        }
        System.out.println(cnt);
    }
}
