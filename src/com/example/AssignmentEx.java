package com.example;

public class AssignmentEx {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println(result);
        result += result;   //result = result + result
        System.out.println(result);
        result -= 5;
        System.out.println(result);
        result *= 3;
        System.out.println(result);


    int score = 80;
    String result1 = (score >= 80) ? "pass" : "fail" ;
    System.out.println(result1);

    // 삼항 연산자도 else if 처리를 할 수 있다.
    char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : ((score>70)?'C':'F' )) ;
    System.out.printf("학점은 %c 입니다.", grade);

    }
}
