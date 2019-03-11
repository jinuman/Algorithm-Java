package Recruits.Kakao;
// 오픈채팅방

import java.util.Arrays;
import java.util.HashMap;

public class K2018_OpenChatRoom {
    private static HashMap<String, String> hm = new HashMap<>();    // uid : name (바뀐 정보 저장)

    public static String[] solution(String[] record) {
        int cnt = 0;    // 출력해야할 메세지의 개수
        for (String aRecord : record) {
            String[] line = aRecord.split(" ");
            String act = line[0];   // line[1] = uid, line[2] = name

            switch (act) {
                case "Enter":
                    hm.put(line[1], line[2]);
                    cnt += 1;
                    break;
                case "Leave":
                    cnt += 1;
                    break;
                case "Change":
                    hm.replace(line[1], line[2]);
                    break;
            }
        }
        String[] answer = new String[cnt];
        for (int i = 0; i < record.length; i++) {
            String[] line = record[i].split(" ");
            String act = line[0];   // line[1] = uid, line[2] = name

            switch (act) {
                case "Enter":
                    answer[i] = hm.get(line[1]) + "님이 들어왔습니다.";
                    break;
                case "Leave":
                    answer[i] = hm.get(line[1]) + "님이 나갔습니다.";
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }
}
