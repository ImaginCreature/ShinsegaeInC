package control.loopHW;

import java.util.Scanner;

public class loop1_9041_ex3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.print("점수를 입력하세요. ");
            int score = scan.nextInt();
            if(score >= 80 && score <= 100) {
                System.out.println("축하합니다. 합격입니다.");
            } else if(score <80  && score >= 0) {
                System.out.println("죄송합니다. 불합격입니다.");
            } else break;
        }


    }
}
