package control;

import java.util.Scanner;

public class JungOl2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        String grade ="";

        if(score >= 4.0) grade = "scholarship";
        else if(score >= 3.0) grade = "next semester";
        else if(score >= 2.0) grade = "seasonal semester";
        else grade = "retake";

        System.out.println(grade);


    }
}
