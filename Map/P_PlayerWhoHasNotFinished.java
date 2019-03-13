package Map;
// 완주하지 못한 선수

import java.util.HashMap;

public class P_PlayerWhoHasNotFinished {
    private String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        // participant +1
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        // completion -1
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }
        // 0이 안된 사람들 = 완주 못함
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_PlayerWhoHasNotFinished ins = new P_PlayerWhoHasNotFinished();
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(ins.solution(participant1, completion1));
        System.out.println(ins.solution(participant2, completion2));
        System.out.println(ins.solution(participant3, completion3));
    }
}
