package com.example;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        int charCode = 'A';

        //charCode 의 값이 대문자인지 소문자인지 판별해 봅시다.
        // && 두개는 좌가 false 면 거기서 연산을 멈춘다.
        // & 한개는 비트 연산. 좌가 false라도 좌우 두 개를 다 평가한다.
        if (charCode >= 65 && charCode <= 90) {
            System.out.println("대문자 입니다.");
        } else if (charCode >= 97 && charCode <= 122) {
            System.out.println("소문자 입니다.");
        } else {
            System.out.println("조건 판별 불가");
        }

        // Scanner 클래스 하나의 데이터를 받아서 영문자인지 숫자인지를 구분하여 출력하세요.
        // 만약 해당 데이터가 숫자라면 0~9까지의 숫자인지를 확인해서
        // 0~9 범위의 값이라고 하면 출력 : 0~9까지의 수이군요 !
        Scanner scan = new Scanner(System.in);
        System.out.print("글자를 입력하세요 : ");


        //else if (a>=80 && a<=89) System.out.println("0~9까지의 숫자군요!");
        //변수 선언
        char a = scan.next().charAt(0);

        //값 할당
        String result;
        if (a >= 65 && a <= 90) result = "대문자";
        else if (a >= 97 && a <= 122) result = "소문자";
        else if (a >= 48 && a <= 57) result = "0~9까지의 숫자";
        else result = "입력문자가 조건에 맞지 않아 판별 불가";

        //처리(출력)
        System.out.printf("%s 입니다!\n", result);


        // % 연산자를 이용하여 입력받은 데이터 (숫자가 2 또는 3의 배수인지 구분)
        System.out.print("숫자를 입력하세요 : ");
        int b = scan.nextInt();
        String result2;
        if (b % 2 == 0) result2 = "2의 배수";
        else if (b % 3 == 0) result2 = "3의 배수";
        else result2 = "2 또는 3의 배수가 아닙니다.";
        System.out.printf("%s 입니다!\n", result2);

        // 출력 : 2또는 3의 배수라면 "2 또는 3의 배수이군요"
        System.out.print("숫자를 입력하세요 : ");
        int c = scan.nextInt();
        String result1;
        if (c % 2 == 0 || c % 3 == 0) result1 = "2 또는 3의 배수이군요.";
        else result1 = "2 또는 3의 배수가 아닙니다.";
        System.out.println(result1);

        int x = 0;
        x += 1; //x = x+1;
        System.out.println(x);
        int total = x-= 1;

    }
}
