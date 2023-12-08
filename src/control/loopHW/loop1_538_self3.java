package control.loopHW;

import java.util.Scanner;

public class loop1_538_self3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int integer ;
        while(true) {
            System.out.print("number? ");
            integer = scanner.nextInt();
            if(integer > 0) {
                System.out.println("positive integer");
            } else if(integer < 0) {
                System.out.println("negative number");
            } else if(integer == 0){
                break;
            }
        }
    }
}
