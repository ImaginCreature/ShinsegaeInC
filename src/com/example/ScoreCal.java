package com.example;

import java.util.Scanner;

public class ScoreCal {
    static Scanner scan = new Scanner(System.in);
    static int scoreSum(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    static double scoreAvg(int a){
        return (double)a/4;
    }

    public static void main(String[] args) {
        String name ;
        String[] subject = new String[4];
        int[] score = new int[4];

        System.out.print("학생의 이름을 입력하세요 : ");
        name = scan.nextLine();

        for(int i = 0; i < 4; i++){
            System.out.print("과목의 이름과 해당 성적을 입력하세요 : ");
            subject[i] = scan.next();
            score[i] = scan.nextInt();
            if(i == 3) break;
        }


        int sum = scoreSum(score[0],score[1],score[2],score[3]);
        double avg = scoreAvg(sum);

        System.out.print(name + "학생의 점수는");
        for(int i = 0; i < 4; i++){
            System.out.print(subject[i] + " : " + score[i]+"점 " );
        }
        System.out.println("입니다.");
        System.out.print(name+"학생의 총점은 " + sum +"점, 평균은 " + avg +"점 입니다.");
    }
}
