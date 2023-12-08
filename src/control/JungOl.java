package control;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JungOl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int weight = scan.nextInt();
        int obesity = weight + 100 - height;
        System.out.println(obesity);
        if(obesity > 0)System.out.println("Obesity");

    }
}
