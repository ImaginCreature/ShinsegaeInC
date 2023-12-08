import java.util.Scanner;

public class test3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
/*
        int a = scan.nextInt();
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int b = scan.nextInt();
        int c = scan.nextInt();
        int mul= ((b++)*(--c));
        System.out.printf("%d %d %d",b,c,mul);
*/
        /*
        int d = scan.nextInt();
        int e = scan.nextInt();
        ++d;
        e--;
        System.out.printf("%d %d \n",d,e);
        System.out.printf("%d %d",d,e);
*/
/*
        byte b3 = -128;
        b3--;
        b3--;
        System.out.println(b3);

        b3 = 127;
        b3++;
        System.out.println(b3);
        // loop 구조다.
        */
        byte b4 = 125;
        for(int i = 0; i<5; i++){
            b4++;
            System.out.println(b4);
        }

        //int div = 5/0; // 나중에 try catch 문을 쓸 것이다.
        //System.out.println(div);

        int x=5;
        double d = 0.0;
        double z1 = x/d; //x%d도 마찬가지다.

        if(Double.isInfinite(z1) || Double.isNaN(z1)) {
            System.out.println("값을 산출하기 어렵다.");
        } else {
            System.out.println(z1);
        }



    }
}

