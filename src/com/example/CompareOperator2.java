package com.example;

import java.util.Arrays;
import java.util.Scanner;

class CompareOperator2 {
    // class name : StudentEx1
    // 학생 이름, 과목 : 국어, 영어, 수학
    // 데이터를 입력받아 총점과 평균을 구한 후, 평균이 80점 이상이면 "통과"
    // 80점 미만이면 "실패"
    static Scanner scan = new Scanner(System.in);
    static Student student = new Student();
    static String calculate() {
        System.out.print("이름을 입력하세요 : ");
        student.name = scan.next();

        for(int i = 0; i < 3 ; i++) {
            System.out.print("과목과 점수를 입력하세요 : ");
            student.sbjScore[i][0] = scan.next();
            student.sbjScore[0][i] = scan.next();
            student.sum += Integer.parseInt(student.sbjScore[0][i]);
        }

        student.avg = (double) student.sum/3;

        if (student.avg>=90) student.result = "A";
        else if (student.avg>=80) student.result = "B";
        else if (student.avg >=70) student.result = "C";
        else student.result = "F";
        return student.result;
    }

    public static void main(String[] args) {
        student.result = calculate();
        System.out.printf("%1$s 학생의 과목 평균은 %2$.2f이고 학점은 '%3$s'학점입니다.",student.name, student.avg, student.result);
    }

}