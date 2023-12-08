package control;

import java.util.Scanner;

public class SwitchExam {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("나이를 입력해 주세요! ");
        int age = scan.nextInt();
        String t = scan.nextLine();
        System.out.print("이름을 입력해 주세요! ");
        String name = scan.nextLine();
        String generation = method1(age, name);
        System.out.println(generation);

    }

    public static String method1(int age, String name){
        String generation = "";
        switch (age) {
            case 10 -> generation = "십대~";
            case 20 -> generation = "이십대~";
            case 30 -> generation = "삼십대~";
            case 40 -> generation = "사십대~";
            default -> generation = "알 수 없습니다";
        }

        System.out.printf("당신의 나이는 %d이고 이름은 %s", age, name);
        return generation;
    }


}
