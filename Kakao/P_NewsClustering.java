package Kakao;
// 뉴스 클러스터링
// 원소의 중복을 허용하는 다중 집합
// HashSet 이용해서 교집합: retainAll(), 합집합: addAll()
// HashMap 적절히 활용

import java.util.*;

public class P_NewsClustering {
    private static int solution(String str1, String str2) {
        // 원소가 두글자인 배열 만들기
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            char first = str1.toLowerCase().charAt(i);
            char second = str1.toLowerCase().charAt(i + 1);
            if ('a' <= first && first <= 'z' && 'a' <= second && second <= 'z') {
                a.add(Character.toString(first) + Character.toString(second));
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            char first = str2.toLowerCase().charAt(i);
            char second = str2.toLowerCase().charAt(i + 1);
            if ('a' <= first && first <= 'z' && 'a' <= second && second <= 'z') {
                b.add(Character.toString(first) + Character.toString(second));
            }
        }

        // 빈도수 기록하기
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        for (String str : a) {
            hm1.put(str, hm1.getOrDefault(str, 0) + 1);
        }
        for (String str : b) {
            hm2.put(str, hm2.getOrDefault(str, 0) + 1);
        }

        // 예외처리
        boolean areBothEmpty = false;
        if (a.isEmpty() && b.isEmpty()) {
            areBothEmpty = true;
        }

        // 중복 제거하고 빈도수 비교
        HashSet<String> hs1 = new HashSet<>(a);
        HashSet<String> hs2 = new HashSet<>(b);

        // 교집합
        hs1.retainAll(hs2);
        int interNum = 0;
        for (String item : hs1) {
            interNum += Math.min(hm1.get(item), hm2.get(item));
        }

        // re-setting hs1
        hs1 = new HashSet<>(a);
        // 합집합
        hs1.addAll(hs2);
        int unionNum = 0;
        for (String item : hs1) {
            unionNum += Math.max(hm1.getOrDefault(item, 0), hm2.getOrDefault(item, 0));
        }

        if (areBothEmpty) {
            return 65536;
        } else {
            return (int) ((double) interNum / (double) unionNum * 65536);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));           // 16384
        System.out.println(solution("handshake", "shake hands"));   // 65536
        System.out.println(solution("aa1+aa2", "AAAA12"));          // 43690
        System.out.println(solution("E=M*C^2", "e=m*c^2"));         // 65536
    }
}
