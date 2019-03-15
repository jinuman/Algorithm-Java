package Implementation;
// 2018 윈터 1번 문제
// skill: 선행 스킬, skill_trees: 유저들이 만든 스킬트리
// 선행 스킬을 만족하는 스킬트리의 개수를 return 하는 문제

public class P_SkillTree {
    private static boolean isPossible(String skill, String userSkill) {
        int skillIndex = 0;
        for (int j = 0; j < userSkill.length() && skillIndex < skill.length(); j++) {
            if (skill.charAt(skillIndex) == userSkill.charAt(j)) {
                skillIndex += 1;
            } else {
                if (skill.indexOf(userSkill.charAt(j)) != -1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String userSkill : skill_trees) {
            if (isPossible(skill, userSkill)) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));   // 2
    }
}
