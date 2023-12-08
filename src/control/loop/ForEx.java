package control.loop;

public class ForEx {
    public static void main(String[] args) {
        int total = 0;
//        total += 1;
//        total += 2;
//        total += 3;
//        total += 4;
//        total += 5; //15
//
        for(int i = 0; i < 6; i++) {
            total += i;
        }

        for(int i = 10; i >=0; i--) {
            System.out.println(i);
        }

        for(int row = 1; row <= 2; row++) {     //행(row) 2행
            for(int col = 1; col <=2; col++){      //열(coulmn) 2열
                System.out.printf("%1$d행 %2$d열\n",row,col);
            }
        }

        for(int dan = 2; dan<=9; dan++) {
            for(int i = 1; i <= 9; i++) {
                int mul = dan * i;
                System.out.printf("%1$d x %2$d = %3$d   ",dan,i,mul);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=9; i++) {
            for(int j=2; j<=9; j++) {
                int mul = i*j;
                System.out.printf("%1$d x %2$d = %3$d\t",j,i,mul);
            }
            System.out.println();
        }

    }
}
