package com.example;

import java.util.Scanner;

public class test1 {
    static final double PI = 3.14;

    static Scanner scan = new Scanner(System.in);
    //여기다 쓰면 stack area에 저장된다. (non static)static에서 접근하기 어려워진다. 그래서 앞에 static을 써준다.

    public static void main(String[] args) {
/*
        System.out.print("가격을 입력해주세요 : ");
        int productPrice = scan.nextInt();
        System.out.printf("상품의 가격:%1$d원\n",productPrice);
        System.out.printf("상품의 가격:%1$6d원\n",productPrice);
        System.out.printf("상품의 가격:%1$-6d원\n",productPrice);
        System.out.printf("상품의 가격:%1$06d원\n",productPrice);

        System.out.print("반지름 입력 : ");
        int r = scan.nextInt();
        System.out.printf("반지름이 %1$d인 원의 넓이:%2$10.2f\n",r, r*r*PI);
        System.out.printf("%1$10d|%2$-10s|%3$10s\n",1, "홍길동", "도적");

        // 1. Scanner 클래스를 이용하여 정수형 변수 a, b에 값을 입력받고
        // 두 변수의 결과값을 result 변수에 저장한 후 출력하는 코드 작성
        // 주의점 : Scanner 클래스 입력값을 형변환
        System.out.print("a의 값 입력 : ");
        int a = scan.nextInt();
        System.out.print("b의 값 입력 : ");
        int b = scan.nextInt();
        int result = a+ b;
        System.out.println("a+b = "+result);
*/
        /*
        System.out.print("a의 값을 입력해주세요 : ");
        String tempX = scan.nextLine();
        int a = Integer.parseInt(tempX);

        System.out.print("b의 값을 입력해주세요 : ");
        String tempB = scan.nextLine();
        int b = Integer.parseInt(tempB);

        int result = a + b ;
        System.out.printf("a + b = %02d \n", result);
*/
        //2. 문자열을 한 줄씩 입력받아서 계속 출력하는 프로그램, 만약에 "q"가 입력되었다면 입력받기 멈춤 !
        // for, while 사용. for는 추출기 목적이 있다. while 안에 for를 넣을 수 있지만 for 안에 while을 넣는 경우는 드물다.
/*
        String str = scan.nextLine();
        while(!str.equals("q")){
            str = scan.nextLine();
        }
*/
/*
        boolean flag = true;
        while(flag){
            System.out.println("원하는 문자열을 입력하세요 : ");
            String data = scan.nextLine();
            // 종료 조건 제시
            //== 는 주소값을 비교하겠다는 의미. equals 를 써야 한다.
            if(data.equals("q")) break;
            System.out.println("출력문자열 : " + data);

        }
        System.out.println("프로그램 종료");
*/
        /*
        //3
        System.out.print("이름을 입력하세요 : ");
        String name = scan.nextLine();
        int[] score = new int[4];
        int sum = 0;
        System.out.println("국어, 영어, 수학, 과학 순으로 성적을 입력해주세요.");
        for (int i = 0; i<5; i++){
            score[i] = scan.nextInt();
            sum += score[i];
        }
        double avg = (double) sum/4;
        System.out.printf("%1$s 학생의 점수는 국어 : %2$d점, 영어 : %3$d점, 수학 : %4$d점, 과학 : %5$d점 입니다. \n", name, kor, eng, math, sci);
        System.out.printf("%1$s 학생의 총점은 %2$d점, 평균은 %3$.1f점 입니다.", name, sum, avg);


*/


    }
}
