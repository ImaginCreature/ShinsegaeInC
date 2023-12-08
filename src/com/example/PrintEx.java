package com.example;

public class PrintEx {
    public static void main(String[] args) {
        System.out.printf("이름 : %s %s %s \n", "신세계", "INC","입사");
        //정수 %d 실수 %f 문자열 %s

        System.out.printf("나이는 %1$d 살 입니다. \n", 25);
        System.out.printf("이름은 %1$s , 나이는 %2$s \n", "신세계", 25);

        //123
        System.out.printf("%1$d \n",123);
        //___123
        System.out.printf("%1$6d \n", 123);
        //123___
        System.out.printf("%1$-6d \n", 123);
        //000123
        System.out.printf("%1$06d \n", 123);
        //0000123.45
        System.out.printf("%010.2f \n", 123.45);
        //abc
        System.out.printf("%6s\n", 123);
        //abc___
        System.out.printf("%-6s %% \t \' \n", "abc");
    }
}
