package Implementation;
// 2016년
// 날수를 계산한 다음 7로 나눈 나머지 값에 의해 요일을 알 수 있음

public class P_Year2016 {
    private static String solution(int a, int b) {
        String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numOfDays = 0;
        for (int i = 0; i < a - 1; i++) {
            numOfDays += month[i];
        }
        numOfDays += b;
        int dayOfWeek = (numOfDays + 4) % 7;  // 1월 1일이 금요일이므로 +4
        return week[dayOfWeek];
    }

    public static void main(String[] args) {
        int a = 5, b = 24;
        System.out.println(P_Year2016.solution(a, b));
    }
}
