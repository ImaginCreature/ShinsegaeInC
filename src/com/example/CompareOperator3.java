package com.example;

public class CompareOperator3 {
    public static void main(String[] args) {

        char a = 65;
        int b = 67;

        if (a == b) {
            System.out.println("같음");
        } else if (a != b){   //else if 는 다중 조건
            System.out.println("다름");
        } else {
            System.out.println("조건 비교 불가");
        } // 나중엔 exception 으로 처리한다.

        // 유의하기 ! 부동소수점을 다르게 처리해서.
        // 실수 타입은 0.1 을 정확히 표시할 수 없다.
        // 따라서 float 타입과 double 타입은 정밀도 차이 때문에 눈으로 보기에 같은 숫자도 서로 다르다.
        float f1 = 0.1f;
        double f2 = 0.1;
        // double 을 demotion 한다면 둘은 같아진다.

        if (f1 == f2) {
            System.out.println("같음");
        } else if (f1 != f2) {
            System.out.println("다름");
        } else {
            System.out.println("조건 비교 불가");
        }

        double f3 = (float) 0.1;
        System.out.println(f3 == f1);

        //String var는 메모리 주소값을 가지고 있지 실제 값을 가지고 있지 않다.
        // 내가 java 답게 짜고 싶다면 api 를 항상 체크하는 습관을 길러라.
        String s1 = "abc"; // (원본 문자열)
        String s2 = "Abc"; // (비교 문자열)
        // equals 는 Object class 에 있다.
        // Object class 는 주소값을 비교할 때 사용한다.
        // String class 는 Object class 를 Overriding (재정의)해서 사용한다.
        // euqlas 는 Object class 에 String class의 특징을 추가한 것이다.
        boolean result = s1.equals(s2);
        result = ! s1.equals(s2);
        System.out.println(result);

        //모든 코딩은 입력, 저장, 처리, 출력 4단계
        // VDA 가 입력, 저장. 처리 출력은 함수

    }
}
