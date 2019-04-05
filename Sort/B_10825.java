package Sort;
// 국영수
// Comparable
// 국어 점수 - 내림차순
// 국어 점수가 같으면 영어점수 - 오름차순
// 국어 점수와 영어 점수가 같으면 수학점수 - 내림차순
// 모든 점수가 같으면 이름 - 사전순(오름차순) 대문자 < 소문자

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_10825 {
    private static class Student implements Comparable<Student> {

        String name;// 학생 이름
        int kor;    // 국어 점수
        int eng;    // 영어 점수
        int math;   // 수학 점수

        Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Student o) {
            if (this.kor == o.kor) {
                if (this.eng == o.eng) {
                    if (this.math == o.math) {
                        // 이름 - 오름차순
                        return this.name.compareTo(o.name);
                    } else {
                        // 수학 - 내림차순
                        return o.math - this.math;
                    }
                } else {
                    // 영어 - 오름차순
                    return this.eng - o.eng;
                }
            } else {
                // 국어 - 내림차순
                return o.kor - this.kor;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stuNum = sc.nextInt();   // 학생 수
        List<Student> students = new ArrayList<>();

        while (stuNum != 0) {
            stuNum -= 1;
            students.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(students);

        for (Student name : students) {
            System.out.println(name);
        }
    }
}


