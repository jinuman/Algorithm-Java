package Recruits.Kakao;
// 실패율

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K2018_FailureRate {
    public class Item implements Comparable<Item> {
        double failurePercent;
        int stageNum;

        Item(double failurePercent, int stageNum) {
            this.failurePercent = failurePercent;
            this.stageNum = stageNum;
        }

        @Override
        public int compareTo(Item o) {
            if (this.failurePercent > o.failurePercent) {
                return -1;
            } else if (this.failurePercent < o.failurePercent) {
                return 1;
            }
            return 0;
        }
    }

    public int[] solution(int N, int[] stages) {    // N : 스테이지 개수
        int[] answer = new int[N];
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int reachedPlayer = 0;
            int reachedButNotClearPlayer = 0;
            for (int stage : stages) {
                if (i == stage) {
                    reachedButNotClearPlayer += 1;
                    reachedPlayer += 1;
                } else if (i <= stage) {
                    reachedPlayer += 1;
                }
            }
            list.add(new Item((double) reachedButNotClearPlayer / (double) reachedPlayer, i));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).stageNum;
        }
        return answer;
    }

    public static void main(String[] args) {
        K2018_FailureRate ins = new K2018_FailureRate();
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(ins.solution(5, stages1)));
        System.out.println(Arrays.toString(ins.solution(4, stages2)));
    }
}
