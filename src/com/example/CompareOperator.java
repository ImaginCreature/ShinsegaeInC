package com.example;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name ;
    String[][] sbjScore = new String[3][3];
    int sum;
    double avg;
    String result;
}

class CompareOperator {
        // class name : StudentEx1
        // 학생 이름, 과목 : 국어, 영어, 수학
        // 데이터를 입력받아 총점과 평균을 구한 후, 평균이 80점 이상이면 "통과"
        // 80점 미만이면 "실패"
    static Scanner scan = new Scanner(System.in);
    static Student student = new Student();
    static String calculate() {
        int sum=0;
        System.out.print("이름을 입력하세요 : ");
        student.name = scan.next();
        for(int i = 0; i < 3 ; i++) {
            System.out.print("과목과 점수를 입력하세요 : ");
            student.sbjScore[i][0] = scan.next();
            student.sbjScore[0][i] = scan.next();
            sum += Integer.parseInt(student.sbjScore[0][i]);
        }
        double avg = (double) sum/3;
        String result;
        if (avg>=80) result = "통과";
        else result = "실패";
        return result;
    }

    public static void main(String[] args) {
        String result = calculate();
        System.out.println(result);
    }


}
