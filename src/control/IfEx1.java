package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 점수를 입력 받아서 100점-90점 사이 'A' 89-80 'B' 79-70 'C', 70 미만 F

        System.out.print("점수를 입력하세요 : ");
        int score = scan.nextInt();
        if( (90<=score) && (score <=100)) {
            char grade = 'A';
            System.out.printf("점수는 %1$d점, 학점은 %2$c 입니다.", score, grade);
        } else if((80<=score) && (score <=89)){
            char grade = 'B';
            System.out.printf("점수는 %1$d점, 학점은 %2$c 입니다.", score, grade);
        } else if((70<=score) && (score <=79)){
            char grade = 'C';
            System.out.printf("점수는 %1$d점, 학점은 %2$c 입니다.", score, grade);
        } else {
            char grade = 'F';
            System.out.printf("점수는 %1$d점, 학점은 %2$c 입니다.", score, grade);
        }

        System.out.println();
        // Math.random() 주사위를 굴려서 1~6 중 하나의 값을 뽑아 뽑힌 숫자 출력
        // 0.0 * 6+1 <= Math.random() * 6 + 1< (1.0 * 6)+1

        int num = (int)(Math.random()*6)+1;
        System.out.println(num);


    }
}
