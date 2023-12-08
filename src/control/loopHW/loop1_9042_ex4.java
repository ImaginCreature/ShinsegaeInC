package control.loopHW;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class loop1_9042_ex4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int count=0;
//        int sum = 0;
//        //1. ordinary
//        while(true) {
//            int integer = scanner.nextInt();
//            if(integer != 0) {
//                ++count;
//                sum += integer;
//            } else break;
//        }
//
//        double average = (double) sum/count;
//
//        System.out.printf("입력된 자료의 개수 = %d \n", count);
//        System.out.printf("입력된 자료의 합계 = %d \n", sum);
//        System.out.printf("입력된 자료의 평균 = %.2f \n", average);



        //2. use ArrayList, IntSummaryStatistic class
        ArrayList<Integer> intArrayList = new ArrayList();
        while(true) {
            int input = scanner.nextInt();
            if (input == 0) break;
            intArrayList.add(input);
        }
        int count = intArrayList.size();
        // use IntSummaryStatistics class
        IntSummaryStatistics intSummaryStatistics = intArrayList
                .stream()
                .mapToInt(num -> num)
                .summaryStatistics();
        //int sum = intArrayList();
        double sum = intSummaryStatistics.getSum();
        double average = intSummaryStatistics.getAverage();

        System.out.printf("입력된 자료의 개수 = %d \n", count);
        System.out.printf("입력된 자료의 합계 = %d \n", (int)sum);
        System.out.printf("입력된 자료의 평균 = %.2f \n", average);
    }
}
