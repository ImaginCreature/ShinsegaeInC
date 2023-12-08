package control.loopHW;

import java.util.Scanner;
public class Beginner_1523 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(m == 1) {
            for(int i = 0; i < n; i++) {
                String star = "*";
                System.out.printf("%s\n", star);
                star += "*";
            }
        } else if (m == 2) {
            for(int i = 0; i < n; i++) {
                int starNumber = n-i;
                for(int j = ; j < ; j++) {

                }

            }
        } else if (m == 3) {
            for(int i = 0; i < n; i++) {

            }
        } else System.out.println("INPUT ERROR!");

    }
}
