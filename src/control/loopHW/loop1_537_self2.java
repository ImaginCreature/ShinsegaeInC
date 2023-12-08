package control.loopHW;

import java.util.Arrays;
import java.util.Scanner;

public class loop1_537_self2 {
    static Scanner scan = new Scanner(System.in);
    // BufferedReader or InputStreamReader 사용해보기
    public static void main(String[] args) {
        //1. while 문 이용해서 풀기
//        int i = 1;
//        int number = scan.nextInt();
//        int totalValue = 0;
//        while(i <= number) {
//            totalValue += i;
//            i++;
//        }
//        System.out.println(totalValue);

        //2. array 로 풀기
        int number = scan.nextInt();
        int[] array = new int[number];
        for(int i=0; i < number; i++) {
            array[i] += (i+1);
        }
        // 항상 재사용성을 고민하기
        int result = Arrays.stream(array).sum();
        System.out.println(result);

    }
}
